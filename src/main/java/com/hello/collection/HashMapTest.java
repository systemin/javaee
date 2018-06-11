package com.hello.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
  //collect And map
  public static void main(String[] args) {
         testmp();
  }
  public static void testmp(){
    Map<Integer, String> map=new HashMap<Integer, String>();

    int i=0;
    map.put(1,"序号"+201);
    while (i<50){
      map.put(i,"序号"+i);
      i++;
    }
    map.put(-1, "序号:"+200);
    map.put(200, "序号:"+200);
    for(Map.Entry<Integer , String> entry : map.entrySet()){
      System.out.println("key:"+entry.getKey()+"  value:"+entry.getValue());
    }
  }
}
