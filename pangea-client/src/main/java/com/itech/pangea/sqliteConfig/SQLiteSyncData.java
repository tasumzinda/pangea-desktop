/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itech.pangea.sqliteConfig;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

/**
 *
 * @author Admin
 */
public class SQLiteSyncData {
    private String Records;
        public String TableName;

        public String QueryInsert;
        public String QueryUpdate;
        public String QueryDelete;

        public String TriggerInsert;
        public String TriggerUpdate;
        public String TriggerDelete;

        public String TriggerInsertDrop;
        public String TriggerUpdateDrop;
        public String TriggerDeleteDrop;

        public int SyncId;
        public String SQLiteSyncVersion;

        public SQLiteSyncDataRecord[] getSQLiteSyncDataRecords() throws Exception {
            List<SQLiteSyncDataRecord> dataRecords = new ArrayList<>();

            Object recordsObject = XML.toJSONObject(Records).getJSONObject("records").get("r");

            JSONArray recordsJsonArray = new JSONArray();

            if(recordsObject instanceof JSONArray){
                recordsJsonArray = (JSONArray) recordsObject;
            }
            else if(recordsObject instanceof JSONObject) {
                recordsJsonArray.put(recordsObject);
            }

            for (int i = 0; i < recordsJsonArray.length(); i++) {
                JSONObject recordObject = recordsJsonArray.getJSONObject(i);
                int action = recordObject.getInt("a");
                Object columnsObject = recordObject.get("c");

                JSONArray columnsJsonArray = new JSONArray();
                if(columnsObject instanceof JSONArray) {
                    columnsJsonArray = (JSONArray) columnsObject;
                }
                else {
                    columnsJsonArray.put(columnsObject);
                }

                String[] columnsArray = new String[columnsJsonArray.length()];
                for(int j = 0; j < columnsJsonArray.length(); j++) {
                    columnsArray[j] = columnsJsonArray.getString(j);
                }

                dataRecords.add(new SQLiteSyncDataRecord(action, columnsArray));
            }

            return dataRecords.toArray(new SQLiteSyncDataRecord[dataRecords.size()]);
        }

}
