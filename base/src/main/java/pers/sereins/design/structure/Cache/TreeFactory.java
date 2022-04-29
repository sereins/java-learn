package pers.sereins.design.structure.Cache;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    static Map<String ,TreeType> treeTypeMap = new HashMap<>();

    public static TreeType TreeType(String name, Color color, String otherTreeType){
        TreeType result = treeTypeMap.get(name);

        if (result == null){
            result = new TreeType(name,color,otherTreeType);
            treeTypeMap.put(name,result);
        }
        return result;
    }
}
