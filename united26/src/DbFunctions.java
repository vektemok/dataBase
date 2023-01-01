import java.sql.Connection;
import java.sql.DriverManager;

public class DbFunctions {
    public Connection connectToDb(String dbName, String user, String password) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc.postgresql://localhost:5432/" + dbName, user, password);
            if (conn != null) {
                System.out.println("Подключение прошло успешно");
            } else {
                System.out.println("Не удалось подключится к базе данных");
            }


        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

}
