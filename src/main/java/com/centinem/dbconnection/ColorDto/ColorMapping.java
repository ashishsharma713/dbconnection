package com.centinem.dbconnection.ColorDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

// POJO Class for mapping color name
public class ColorMapping {

    private String name;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ColorMapping> subclass;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ColorMapping> getSubclass() {
        return subclass;
    }

    public void setSubclass(List<ColorMapping>  subclass) {
        this.subclass = subclass;
    }



}
