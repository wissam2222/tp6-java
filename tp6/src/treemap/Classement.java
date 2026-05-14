package treemap;
import java.util.*;
public class Classement {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Wissam");
        map.put(50, "Saad");
        map.put(200, "Oualid");
        System.out.println(map);
        System.out.println("Premier : " + map.firstEntry());
        System.out.println("Dernier : " + map.lastEntry());
        System.out.println(map.tailMap(100));
    }
}