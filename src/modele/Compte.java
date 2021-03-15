package modele;
import java.util.LinkedList;

public class Compte {
    private int cle;
    private String numCompte;
    private float solde;
    private Banque banque;
    private LinkedList<Operation> opirations;

    public Compte (String numCompte, float solde){
        this.numCompte = numCompte;
        this.solde = solde;
    } 
    
    public Compte (){
        this.numCompte = "";
        this.solde = 0;
    }
    

    public boolean equals (Compte c){
        return c.numCompte == this.numCompte;
    }

    public int getCle() {
        return cle;
    }

    public void setCle(int cle) {
        this.cle = cle;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public LinkedList<Operation> getLesOperations(){
        return this.opirations;
    }

    public void addLesOperations(String intitule, String dateOperation, float montant){
        this.opirations.add(new Operation(intitule, dateOperation, montant));
    }
    
}