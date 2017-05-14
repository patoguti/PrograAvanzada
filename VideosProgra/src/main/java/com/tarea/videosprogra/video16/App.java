package com.tarea.videosprogra.video16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author toupa
 */
public class App {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("3","Mitocode");
//        map.put("4","Mito");
//        map.put("1","code");
//        map.put("6","Mitocode");
//        map.put("5","Pato");
//        map.put("2",null);
//
//        
//        Iterator it = map.keySet().iterator();
//        while(it.hasNext()){
//            String key = (String) it.next();
//            System.out.println(key+" "+map.get(key));
//        }
//        
//        
//        Map<String, String> map2 = new LinkedHashMap<>();
//        map2.put("3","Mitocode");
//        map2.put("4","Mito");
//        map2.put("1","code");
//        map2.put("6","Mitocode");
//        map2.put("5","Pato");
//        map2.put("2",null);
//
//        
//        Iterator it2 = map2.keySet().iterator();
//        while(it2.hasNext()){
//            String key = (String) it2.next();
//            System.out.println(key+" "+map2.get(key));
//        }
//        
//        Map<String, String> map3 = new TreeMap<>();
//        map3.put("3","Mitocode");
//        map3.put("4","Mito");
//        map3.put("1","code");
//        map3.put("6","Mitocode");
//        map3.put("5","Pato");
//        map3.put("2",null);
//
//        
//        Iterator it3 = map3.keySet().iterator();
//        while(it3.hasNext()){
//            String key = (String) it3.next();
//            System.out.println(key+" "+map3.get(key));
//        }
        
        Map<Persona, String> map = new HashMap<>();
        map.put(new Persona(1,"pato",26),"Mitocode");
        map.put(new Persona(3,"patoo",29),"Mito");
        map.put(new Persona(4,"patooo",27),"code");
        map.put(new Persona(6,"topa",24),"Mitocode");
        map.put(new Persona(2,"patopa",23),"Pato");
        map.put(new Persona(5,"patoto",20),null);
        for(Entry ent : map.entrySet()){
            System.out.println(ent.getKey()+" "+ent.getValue());
        }
    }
}
