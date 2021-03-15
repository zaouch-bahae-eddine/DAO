import dao.CompteDAOMySQL;
import modele.Compte;

public class Test {
  public static void main(String[] args) {
      Compte compte = new Compte("44N", 5004);
      CompteDAOMySQL DAOcompte = CompteDAOMySQL.getInstance();
      DAOcompte.create(compte);
  }  
}
