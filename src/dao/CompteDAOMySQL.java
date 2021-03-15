package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import datasourceManagement.MySQLManager;
import modele.Compte;

public class CompteDAOMySQL {
    private static CompteDAOMySQL instance;
    private MySQLManager manager;

    private CompteDAOMySQL(){
        manager = MySQLManager.getInstance();
    }

    public static synchronized CompteDAOMySQL getInstance(){
        if(instance == null){
            instance = new CompteDAOMySQL();
        }
        return instance;
    }

    public Compte create (Compte c){
        String req = "INSERT INTO compte (num_compte, solde) values ('"+c.getNumCompte()+"', '"+c.getSolde()+"')";
        int cle = manager.setData(req);
        c.setCle(cle);
        return c;
    }

    public Compte delete (Compte c){
        String req = "DELETE FROM compte WHERE compte.id = "+ c.getCle();
        int cle = manager.setData(req);
        c.setCle(cle);
        return c;
    }

    public Compte update (Compte c){
        String req = "INSERT INTO compte (num_compte, solde) values ('"+c.getNumCompte()+"', '"+c.getSolde()+"') WHERE compte.id = "+ c.getCle();
        int cle = manager.setData(req);
        c.setCle(cle);
        return c;
    }

    public void saveAll(LinkedList<Compte> comptes){
        String req = "INSERT INTO compte (num_compte, solde) values ";
        int k = 1;
        for(Compte c : comptes){
            if(k < comptes.size()) {
                req += "('"+c.getNumCompte()+"', '"+c.getSolde()+"'), ";
            } else {
                req += "('"+c.getNumCompte()+"', '"+c.getSolde()+"')";
            }
            k++;
        }
        manager.setData(req);
     }

     public Compte findById (int id){
        String req = "SELECT * FROM compte WHERE compte.id = "+ id;
        Compte c = new Compte();
        try {
            ResultSet rs = manager.getData(req);
            rs.next();
            c.setCle(rs.getInt("id"));
            c.setNumCompte(rs.getString("num_compte"));
            c.setSolde(rs.getFloat("solde"));
        } catch (SQLException e) {
            //TODO: handle exception
        }
        return c;
       
    }

    public LinkedList<Compte> findAll (){
        String req = "SELECT * FROM compte";
        LinkedList<Compte> comptes = new LinkedList<>();
        try {
            ResultSet rs = manager.getData(req);
            while(rs.next()){
                Compte c = new Compte();
                c.setCle(rs.getInt("id"));
                c.setNumCompte(rs.getString("num_compte"));
                c.setSolde(rs.getFloat("solde"));
                comptes.add(c);
            }
        } catch (SQLException e) {
            //TODO: handle exception
        }
        return comptes;
       
    }
}
