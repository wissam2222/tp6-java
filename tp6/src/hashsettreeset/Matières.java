package hashsettreeset;
import java.util.*;
public class Matières {

	public static void main(String[] args) {
		HashSet<String> matieres = new HashSet<>();
        matieres.add("Math");
        matieres.add("Physique");
        matieres.add("svt");
        System.out.println(matieres);
        TreeSet<String> trie = new TreeSet<>(matieres);
        System.out.println(trie);
    }

	}

