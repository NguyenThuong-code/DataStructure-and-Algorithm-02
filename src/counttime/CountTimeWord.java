package counttime;

import java.util.*;

public class CountTimeWord {
    public static void main(String[] args) {
        String str ="All living things that live on this earth comes under the environment. Whether they live on land or water they are part of the environment";
String[] arr= str.split("");
String key ="";
Integer value;
TreeMap<String, Integer> map = new TreeMap<>();
for (int i=0; i<arr.length;i++){
    key =arr[i].toLowerCase(Locale.ROOT);
    if (map.containsKey(key)){
        value= map.get(key);
        map.remove(key);
        map.put(key,value+1);

    }else {
        map.put(key,1);
    }
}
Set set= map.keySet();
Iterator i= set.iterator();

while (i.hasNext()){
    key=(String)i.next();
    System.out.println(key + map.get(key));
}

    }

    }

