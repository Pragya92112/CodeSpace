import java.sql.*;

public class Database {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/pragya"; // Replace 'localhost' with your database server

    static final String USER = "root";
    static final String PASSWORD = "Pragya@27";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // Execute a query to retrieve data
            System.out.println("Retrieving data from mango table...");
            statement = connection.createStatement();
            String query = "SELECT * FROM mango";
            ResultSet resultSet = statement.executeQuery(query);

            // Display the retrieved data
            /*
            System.out.println("User details:");
            while (resultSet.next()) {
                String Name = resultSet.getString("Name");
                String Password = resultSet.getString("Password");
                String Email_id = resultSet.getString("Email_id");
                String Phone_number=resultSet.getString("Phone_number");

                System.out.println("Name = " + Name + " Password = " + Password + " Email_id = " + Email_id + " Phone_number = " + Phone_number);
            }
            */
            // Insert new user details
             
            System.out.println("Inserting new user details...");
            String insertQuery = "INSERT INTO mango VALUES (04, 'kala' ,'noida')";
            statement.executeUpdate(insertQuery);
            System.out.println("New user details inserted successfully."); 

        } 

        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            
        } 
        finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}