package modele;
import java.util.LinkedList;

public class Banque {
    private LinkedList<Compte> lesComptes;

    public Banque (){
        lesComptes = new LinkedList<Compte>();
    }

    public LinkedList<Compte> getLesComptes(){
        return lesComptes;
    }

    public void setLesComptes(LinkedList<Compte> C){
        lesComptes = C;
    }

    public void addCompte(String NumCompte, float solde){
        lesComptes.add(new Compte(NumCompte, solde));
    }
}