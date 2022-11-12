package DAO;

import UserDB.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public UserDAO() {
        try {
            String dbURL = "jdbc:localhost://3306/Z_V";
            String dbID = "root";
            String dbPw = "root";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL,dbID,dbPw);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public int join(User user) {
        String SQL = "INSERT INTO USER VALUES (?,?,?,?,?,?,?)";
        try{
            pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1, user.getUser_number());
            pstmt.setString(2, user.getUser_ID());
            pstmt.setString(3, user.getUser_PW());
            pstmt.setString(4, user.getUser_name());
            pstmt.setString(5, user.getUser_email());
            pstmt.setString(6, user.getAnimal());
            pstmt.setString(7, user.getArea());
            return pstmt.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1; //데이터베이스 오류
    }
}
