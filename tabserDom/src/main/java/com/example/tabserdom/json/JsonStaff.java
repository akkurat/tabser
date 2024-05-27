package com.example.tabserdom.json;

import static java.util.stream.Collectors.*;

import com.example.tabserdom.dom.DomStaff;

import java.util.Collection;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JsonStaff {
    public String content;
    public String instrument;

    public static JsonStaff ofDom(DomStaff domStaff) {


        // e.g. here DomBar has no reprensation in JSON

        var bars = new StringBuilder();

        bars.append("|");
        for (var domBar : domStaff.bars) {
            var notes = domBar.notes;
            for (var note : notes) {
                StringJoiner joiner = new StringJoiner("","[","]");
                for (String string : domStaff.strings) {
                    Integer fret = note.notes.get(string);
                    if (fret != null) {
                        joiner.add(string);
                        joiner.add(fret.toString());
                    }
                }
                bars.append(joiner);
            }
            bars.append("|");
        }

        var jsonStaff = new JsonStaff();
        jsonStaff.content = bars.toString();
        jsonStaff.instrument = domStaff.instrumentName;
        return jsonStaff;

    }
}
