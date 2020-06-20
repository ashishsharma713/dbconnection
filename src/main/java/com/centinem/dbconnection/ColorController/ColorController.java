package com.centinem.dbconnection.ColorController;

import com.centinem.dbconnection.ColorEntity.Color;
import com.centinem.dbconnection.ColorDto.ColorMapping;
import com.centinem.dbconnection.ColorService.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ColorController {


    @Autowired
    public ColorService colorService;

    @PostMapping(path = "addColor", consumes = "application/json", produces = "application/json")
    public void colorAdd(@RequestBody Color color) {
        colorService.addColor(color);

    }
    @GetMapping(path="getColor/{id}", produces = "application/json")
    public List<Color> fetchColorById(@PathVariable("id") int id)
    {
        return colorService.fetchColorById(id);
    }

    @GetMapping(path="allColor", produces = "application/json")
    public List<Color> fetchAllColor()
    {
        return colorService.fetchAllColor();
    }


    @GetMapping(path="colorlist", produces = "application/json")
    public List<ColorMapping>  getColorHiearchy()
    {
        return colorService.getColorHiearchy();
    }
}