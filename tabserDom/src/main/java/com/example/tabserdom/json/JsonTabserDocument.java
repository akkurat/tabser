package com.example.tabserdom.json;

import com.example.tabserdom.dom.DomTabserDocument;

import java.util.ArrayList;

public class JsonTabserDocument {
    public ArrayList<JsonStaff> staffs;

    public static JsonTabserDocument ofDom(DomTabserDocument domDoc) {
        var jsonStaffs = new ArrayList<JsonStaff>();
        for (var domStaff : domDoc.staffs) {
            jsonStaffs.add(JsonStaff.ofDom(domStaff));
        }
        JsonTabserDocument jsonTabserDocument = new JsonTabserDocument();
        jsonTabserDocument.staffs = jsonStaffs;
        return jsonTabserDocument;

    }
}
