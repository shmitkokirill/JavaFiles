package com.company;

import org.json.JSONArray;
import org.json.JSONObject;
import org.mortbay.util.ajax.JSONObjectConvertor;

import java.util.List;
import java.util.Map;

public class Task3_JSON {
    public JSONArray createJSONFromMap(List<Map<String, String>> personInfo) {
        JSONArray result = new JSONArray();
        int i = 1;
        for (var map : personInfo ) {
            JSONObject personData = new JSONObject();
            for (var key : map.keySet()) {
                personData.put(key, map.get(key));
            }
            JSONObject person = new JSONObject();
            person.put("Person " + i++, personData);
            result.put(person);
        }
        return result;
    }

    public JSONArray parseJsonFromString(String fileData) {
        return new JSONArray(fileData);
    }
}
