package com.JsonConstructor;

import java.lang.reflect.Type;
import java.util.*;

import com.app.Dog;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class JsonHelper {
    private static final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    private static final Type TT_mapStringString = new TypeToken<Map<String,String>>(){}.getType();

    public static Map<String, Dog> jsonToMapStringString(String json) {
        Map<String, Dog> ret = new HashMap<String, Dog>();
        if (json == null || json.isEmpty())
            return ret;
        return gson.fromJson(json, TT_mapStringString);
    }

    public static String mapStringStringToJson(Map<String, Dog> map) {
        if (map == null)
            map = new HashMap<String, Dog>();
        return gson.toJson(map);
    }
}