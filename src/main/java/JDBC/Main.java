package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/offersdata";
        String uname = "postgres";
        String password = "SQLpass1";
        String query = "select * from person";

       try {
          Connection con = DriverManager.getConnection(url,uname,password);
          Statement statement=con.createStatement();
          ResultSet result = statement.executeQuery(query);

          while (result.next()){
          StringBuilder data = new StringBuilder();
              for (int i = 1; i < 8; i++) {
                  data.append(result.getString(i)).append(":");
              }
            System.out.println(data);
          }
       }
        catch (SQLException e){
           System.err.println(e.getMessage());
        }


    }
}