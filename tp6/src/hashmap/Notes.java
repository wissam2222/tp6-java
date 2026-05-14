package hashmap;
import java.util.*;
public class Notes{
    public static void main(String[] args) {
        HashMap<String, Double> notes = new HashMap<>(); 
        notes.put("wissam", 17.5);
        notes.put("oualid", 18.0);
        notes.forEach((k, v) -> System.out.println("=> "+ k + " : " + v));
        System.out.println("=> Note oualid : " + notes.get("oualid"));
        notes.put("wissam", 18.0);
        notes.remove("oualid");
        double somme = 0;
        for (double n : notes.values()) {
            somme += n;
        }
        System.out.println("=> Moyenne = " + (somme / notes.size()));
    }
}