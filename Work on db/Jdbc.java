import java.sql.*;

public class Jdbc {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/pragya";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Pragya@27";

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                System.out.println("Connected to the database!");

                // Execute a SELECT query
                executeQuery(connection, "insert into mango values(04,'kala','noida');");
                //executeQuery(connection, "SELECT * FROM mango");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeQuery(Connection connection, String query) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            System.out.println("Executing query: " + query);
            
            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String color = resultSet.getString("color");
                String area = resultSet.getString("area");

                System.out.println("ID: " + id + ", Color: " + color + ", Area: " + area);
            }
        }
    }
}
