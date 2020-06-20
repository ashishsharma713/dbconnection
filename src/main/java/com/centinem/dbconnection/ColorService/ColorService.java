package com.centinem.dbconnection.ColorService;

import com.centinem.dbconnection.ColorEntity.Color;
import com.centinem.dbconnection.ColorDto.ColorMapping;
import com.centinem.dbconnection.ColorRepository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorepository;

    //add the color to repository
    public void addColor(Color color) {
        colorepository.save(color);
    }

    //To fetch color based on Id
    public List<Color> fetchColorById(int id) {
        List<Color> ls = new LinkedList<>();
        ls = colorepository.findColorByParentId(id);
        return ls;
    }

    //Fetch list of All Color
    public List<Color> fetchAllColor() {
        List<Color> ls = new LinkedList<>();
        colorepository.findAll().forEach(ls::add);
        return ls;
    }




    //Form nested Json
    public List<ColorMapping> getColorHiearchy() {

        List<Color> color=fetchAllColor();
        Map<Integer,ColorMapping> colorMappingMap=new LinkedHashMap<>();
        Map<Integer,Color> parentMap=new LinkedHashMap<>();
        List<Integer> auxiliaryList=new ArrayList<>();
        for(Color col:color)
        {
            ColorMapping colormappping=new ColorMapping();
            colormappping.setName(col.getName());
            colorMappingMap.put(col.getId(),colormappping);
            colormappping.setSubclass(new ArrayList<>());
            parentMap.put(col.getId(),col);

        }
        //recursive call to fetch children
         for(Color col:color)
         {
             if(!auxiliaryList.contains(col.getId()))
             {
                 fetchChildren(colorMappingMap,parentMap,col,auxiliaryList);
             }

         }

         //to remove already added entries from map
         for(Integer i:auxiliaryList)
         {
             colorMappingMap.remove(i);
         }
        return new ArrayList<>(colorMappingMap.values());

    }


    private void fetchChildren(Map<Integer,ColorMapping> colormap, Map<Integer,Color>parentMap,Color color,List<Integer> ls)
    {

        if(color.getParentId()!=0)
        {

            ColorMapping col=colormap.get(color.getParentId());
            if(col!=null) {
                col.getSubclass().add(colormap.get(color.getId()));
                ls.add(color.getId());
                if(!ls.contains(color.getParentId())) {
                    fetchChildren(colormap, parentMap, parentMap.get(color.getParentId()), ls);
                }
            }
        }


    }

}