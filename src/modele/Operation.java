package modele;
public class Operation {
    private int cle;
    private String intitule;
    private float montant;
    private String dateOperation;
    private int cleCompte;

    public Operation (String intitule, String dateOperation, float montant){
        this.intitule = intitule;
        this.dateOperation = dateOperation;
        this.montant = montant;
    }
    
    public int getCle() {
        return cle;
    }
    public void setCle(int cle) {
        this.cle = cle;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public float getMontant() {
        return montant;
    }
    public void setMontant(float montant) {
        this.montant = montant;
    }
    public String getDateOperation() {
        return dateOperation;
    }
    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }
    public int getCleCompte() {
        return cleCompte;
    }
    public void setCleCompte(int cleCompte) {
        this.cleCompte = cleCompte;
    }

}