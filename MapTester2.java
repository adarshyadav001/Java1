import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

void main(){
    Map<String, Integer> map = new LinkedHashMap<>();
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    System.err.println("Map: " + map);

    Map<String, Integer> map2 = new HashMap<>();
    map2.putAll(map);
    System.out.println("Map2: " + map2);
    System.out.println("Map.get(\"One\"): " + map.get("One"));
    System.out.println(map.getOrDefault("Four", 0));
}