package com.company;

import java.util.List;
import java.util.Map;

public class Task4_XML {
    public String createXmlData(List<Map<String, String>> data) {
        String result = new String();
        for (var map : data) {
            for (var key : map.keySet()) {
                result += "\n  <" + key + ">" + map.get(key) + "</" + key + ">";
            }
        }
        return result;
    }
}
