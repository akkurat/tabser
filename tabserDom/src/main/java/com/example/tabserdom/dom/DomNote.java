package com.example.tabserdom.dom;

import java.util.HashMap;
import java.util.Map;

public class DomNote {
    //<string,fret>
    public Map<String,Integer> notes = new HashMap<>();
    /**
     * e.g. 4 -> 1/4 note
     */
    public int fraction = 4;
    public DomNote() {}
    public DomNote( Map<String,Integer> notes, int fraction ) {
        this.notes = new HashMap<>(notes);
        this.fraction = fraction;
    }
}
