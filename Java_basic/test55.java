import java.sql.*;

public class JDBCUtil {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("드라이버 파일을 찾을 수 없습니다.");
            return null;
        }
        String connectionString = "jdbc:mysql//gondr.asuscomm.com/yy_10125" + "?useUnicode=true"
                + "&characterEncoding=utf8" + "&useSSL=false" + "&serverTimezone=Asia/Seoul";
        String userID = "yy_10125";
        String password = "1234";

        Connection con = null;

        try {
            con = DriverManager.getConnection(connectionString, userID, password);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.printf("DB 연결중 오류 발생");
        }
        return con;
    }

    public static void close(ResultSet rs) {
        try {
            if (rs != null) rs.close();
        } catch (Exception e) {}
    }
    public static void close(PreparedStatement ps) {
        try {
            if (ps != null) ps.close();
        } catch (Exception e) {}
    }

    public static void close(Connection co) {
        try {
            if (co != null) co.close();
        } catch (Exception e) {}
    }
}
