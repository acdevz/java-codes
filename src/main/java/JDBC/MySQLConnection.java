package JDBC;

import java.sql.*;

public class MySQLConnection {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/emp";
    static final String USER = "root";
    static final String PASSWORD = "4444";

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connected to database. 🔗");

            stmt = con.createStatement();
            String sql = "select * from employees";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("first") + " " + rs.getString("last");
                System.out.println(id + " : " + name);
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ignored) {}
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ignored) {}
            }
        }
    }
}
