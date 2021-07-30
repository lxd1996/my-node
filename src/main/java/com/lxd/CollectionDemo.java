package com.lxd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: xd.liu
 * @date: 2021/7/30
 */
public class CollectionDemo {

    public static void main(String[] args) {
        List<Map<String,Object>> collisionList= new ArrayList<>();

        Map map = new HashMap();
        map.put("view","显示");
        map.put("bindingDate","2222");

        Map map1 = new HashMap();
        map1.put("view","显示");
        map1.put("bindingDate","2222");

        Map map2 = new HashMap();
        map2.put("view","显示1");
        map2.put("bindingDate","2222");

        Map map3 = new HashMap();
        map3.put("view","显示");
        map3.put("bindingDate","2222");

        collisionList.add(map);
        collisionList.add(map1);
        collisionList.add(map2);
        collisionList.add(map3);
        List<Map<String,Object>> tmpList=new ArrayList<Map<String,Object>>();

        Set<String> keysSet = new HashSet<>();

        for(Map<String, Object> collisionMap : collisionList){
            String view = collisionMap.get("view").toString();
            String bindingDate = collisionMap.get("bindingDate").toString();
            String data = view + "_" + bindingDate;

            int beforeSize = keysSet.size();
            keysSet.add(data);

            int afterSize = keysSet.size();
            if(afterSize == beforeSize + 1){
                tmpList.add(collisionMap);
            }
        }

        System.out.println(tmpList);
    }

}
