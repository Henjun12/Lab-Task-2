import java.sql.*;


public class CLASSdb {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASS = "Cina@Trade12";
    static String  driverName = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        try{
            Class.forName(driverName);
            System.out.println("The class ok");

        } catch (ClassNotFoundException ex){
            System.out.println("Error not able to load driver class");

        }

    }

}

