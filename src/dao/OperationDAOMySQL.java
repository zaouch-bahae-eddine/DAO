package dao;


public class OperationDAOMySQL {
    private static OperationDAOMySQL instance;

    private OperationDAOMySQL(){
        
    }

    public static synchronized OperationDAOMySQL getInstatnce(){
        if(instance == null){
            instance = new OperationDAOMySQL();
        }
        return instance;
    }
}
