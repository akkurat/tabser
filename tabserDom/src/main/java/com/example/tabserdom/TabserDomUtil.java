package com.example.tabserdom;

import com.example.tabserdom.dom.DomStaff;
import com.example.tabserdom.dom.DomTabserDocument;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class TabserDomUtil {

    List<DomStaff> staffs = new ArrayList<>();
    public TabserDomUtil(DomTabserDocument document) {
        // todo: map serialized stuff into DOM
        // e.g. for(var s: document.staffs) {
        // addDomStaff(convertToDomStaff)
        // }
        // throw away jackson Tree -> dont keep as member
    }

    static TabserDomUtil read(InputStream someInput) throws IOException {

        var document = new ObjectMapper().readValue(someInput, DomTabserDocument.class);
        return new TabserDomUtil(document);

    }

    public TabserWriteStats write(OutputStream someWhere) {




        return new TabserWriteStats();
    }

}