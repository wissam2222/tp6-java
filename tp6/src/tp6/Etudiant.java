package tp6;
import java.util.*;
public class Etudiant {
	protected int id ;
	protected String nom;
	protected double moyenne ;
	
  public Etudiant(int id, String nom, double moyenne) {
		this.id = id;
		this.nom = nom;
		this.moyenne = moyenne;
    }	
  
    public String toString() {
			return (id + "-"+ nom + "-" + moyenne);}
	public static void main(String[] args) {
			ArrayList<Etudiant>liste=new ArrayList<>();
			
			
			liste.add(new Etudiant(1,"Ali",12));
			liste.add(new Etudiant(2,"Sara",15));
			liste.add(new Etudiant(3,"Wissam",10));
			liste.add(new Etudiant(4,"Lina",17));
			liste.add(new Etudiant(5,"Yassine",14));

            for(Etudiant e : liste) {
	            if(e.nom=="Sara") {
		   
		              System.out.println("Trouvé"+ e);		
						}
					}
             // Supprimer un étudiant(id=2)
             liste.removeIf(e->e.id==2);
   
             //Meilleure moyenne
              Etudiant best = Collections.max(liste,Comparator.comparing(e->e.moyenne));
               System.out.println("Meilleure:"+best);
         }
   }
    