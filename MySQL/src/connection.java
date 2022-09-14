import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

    public static void main(String[] args) throws SQLException {
        Class<Driver> DriverClass = Driver.class;
        try (var connection = ConnectionManager.open()) {
            System.out.println(connection.getTransactionIsolation());
        }

    }

}