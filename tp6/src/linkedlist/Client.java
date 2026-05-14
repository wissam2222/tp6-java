package linkedlist;
import java.util.*;

public class Client{
	
	int numero;
    String nom;
    public Client(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }
    public String toString() {
        return numero + " - " + nom;
    }
	public static void main(String[] args) {
		LinkedList<Client> file = new LinkedList<>();
        file.add(new Client(1, "Ali"));
        file.add(new Client(2, "Sara"));
        System.out.println(file);
        Client servi = file.poll();
        System.out.println("Client servi : " + servi);
        file.addLast(new Client(3, "wissam"));
        System.out.println("Premier : " + file.peek());
    }

	}

