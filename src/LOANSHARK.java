
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eunace Faith Emactao
 */
public class LOANSHARK {
        private static final String URL = "jdbc:mysql://localhost:3306/loanshark";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("SUMAKSES");
        } catch (SQLException e) {
            System.out.println("HINDI SUMAKSES");
            e.printStackTrace();
        }
        return conn;

    }
}
