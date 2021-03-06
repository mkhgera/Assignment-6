package com.company.Singleton;

import java.sql.*;

public class TestSingleton {
    public void singletone() throws SQLException {
        Database dbConnection = Database.getInstance();
        dbConnection.getConnection();

        ResultSet rs = null;
        Statement stmt = null;

        try {
            stmt = dbConnection.getConnection().createStatement();
            rs = stmt.executeQuery("select * from users");
            while (rs.next())
                System.out.println(rs.getInt("user_id") + " " + rs.getString("name") + " " + rs.getString("password"));
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try{
                rs.close();
                stmt.close();
                dbConnection.getConnection().close();
            }
            catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
    }
}
