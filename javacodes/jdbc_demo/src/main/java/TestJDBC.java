
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "123456");
        System.out.println("连接成功！");
        String sql = "update account set money = 2000 where id = 1";
        Statement stmt = conn.createStatement();
        int i = stmt.executeUpdate(sql);
        System.out.println("受影响的行数："+ i);
        stmt.close();
        conn.close();
    }
}
