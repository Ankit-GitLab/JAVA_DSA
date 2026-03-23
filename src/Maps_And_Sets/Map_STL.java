package Maps_And_Sets;
import java.util.*;
public class Map_STL {
    public static void main(String[] args) {
        HashMap<String, Integer> map =new HashMap<>();
        map.put("Ankit",19); map.put("Daksha",2);
        map.put("Nilu",49); map.put("Dharmendra",52);

        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }

//        System.out.println(map+" "+map.size());
//        System.out.println(map.containsKey("Ankit"));
//        System.out.println(map.remove("Ankit"));
//        System.out.println(map+" "+map.size());
//        System.out.println(map.get("Daksha"));
//        System.out.println(map.containsKey("Ankit"));

    }
}
