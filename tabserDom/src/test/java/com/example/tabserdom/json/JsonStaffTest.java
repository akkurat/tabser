package com.example.tabserdom.json;

import com.example.tabserdom.dom.DomBar;
import com.example.tabserdom.dom.DomNote;
import com.example.tabserdom.dom.DomStaff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class JsonStaffTest {

    @Test
    public void ofDom() {
        var domStaff = new DomStaff();
        var bar1 = new DomBar();
        var note1 = new DomNote(Map.of("D", 2, "G", 4), 3);
        var note2 = new DomNote(Map.of("A", 2, "G", 3), 3);
        bar1.notes.add(note1);
        bar1.notes.add(note2);
        domStaff.bars.add(bar1);

        var result = JsonStaff.ofDom(domStaff);
        Assertions.assertAll(
                () -> Assertions.assertEquals("Bass", result.instrument),
                () -> Assertions.assertEquals( "|[G4D2][G3A2]|", result.content)
        );
    }
}