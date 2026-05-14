package miniprojet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Biblio {
    public static void main(String[] args) {
        ArrayList<Livre> livres = new ArrayList<>();
        livres.add(new Livre("101", "Dernier jour d'un condamné", "Victor Hugo", 1862));
        livres.add(new Livre("102", "Les Contes de la Bécasse", "Guy de Maupassant", 1883));
        livres.add(new Livre("103", "boite à merveilles", "Ahmed Sefrioui", 1883));
        HashSet<String> categories = new HashSet<>();
        categories.add("Romans ");
        categories.add("Contes");
        categories.add("Autobiographie");
        HashMap<String, Livre> emprunts = new HashMap<>();
        emprunts.put("wissam", livres.get(0));
        emprunts.put("fatima", livres.get(1));
        String titreRecherche = "Les Contes de la Bécasse";
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titreRecherche)) {
                System.out.println("=> Livre trouvé : \n" + l);
            }
        }
        livres.removeIf(l -> l.getIsbn().equals("102"));
        System.out.println(" Livre Les Contes de la Bécasse 102 supprimé.");
        System.out.println(" Livres Disponibles :");
        for (Livre l : livres) {
            System.out.println(l);
        }
        System.out.println(" Nombre de livres : " + livres.size());
        System.out.println(" Catégories : " + categories);
        System.out.println(" Livres empruntés :");
        for (String etudiant : emprunts.keySet()) {
            System.out.println("+ " + etudiant + " a emprunté -> " +"\n" + emprunts.get(etudiant));
        }
    }
}