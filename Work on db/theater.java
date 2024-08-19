import java.sql.*;
import java.util.Scanner;

public class theater {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/cinema"; 

    static final String USER = "root";
    static final String PASSWORD = "Pragya@27";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        Scanner n = new Scanner(System.in);
        int choise = 1;
        while(choise == 1){

            try {
                // Register JDBC driver
                Class.forName(JDBC_DRIVER);
                
                // Open a connection
                    System.out.println("=============================================");
                    System.out.println("\n********** WELCOME ********** \n");
                    connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);

                    // Execute a query to retrieve data
                    statement = connection.createStatement();
                    String query = "SELECT * FROM hall";
                    ResultSet resultSet = statement.executeQuery(query);

                    System.out.print("Please Enter your name : ");
                    String name = n.nextLine();
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("   ||  Namaste " + name +"  ||");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();

                    // Display the retrieved data
                    System.out.println("Here is our seating arrangement");
                    System.out.println("-------------------------------------------------");
                    System.out.println("| A | B  | C  | D  | E  | F  | G  | H  | I  | J |");
                    System.out.println("-------------------------------------------------");

                    while (resultSet.next()) {
                        String A = resultSet.getString("A");
                        String B = resultSet.getString("B");
                        String C = resultSet.getString("C");
                        String D = resultSet.getString("D");
                        String E = resultSet.getString("E");
                        String F = resultSet.getString("F");
                        String G = resultSet.getString("G");
                        String H = resultSet.getString("H");
                        String I = resultSet.getString("I");
                        String J = resultSet.getString("J");

                        System.out.println("|"+A + " | " + B + " | " + C + " | " + D + " | " + E + " | " + F + " | " + G + " | " + H + " | " + I + " | " + J+"|");
                    }

                    System.out.print("How many seats do you want : ");
                    int num = n.nextInt();
                    System.out.print("\nPlease enter the desired seat numbers : ");

                for(int i=0; i<num; i++){

                    int seat = n.nextInt();

                    String insertQuery = "UPDATE hall set A = '--' where A = "+seat+"";
                    statement.executeUpdate(insertQuery);
                    String insertQuery1 = "UPDATE hall set B = '--' where B = "+seat+"";
                    statement.executeUpdate(insertQuery1);
                    String insertQuery2 = "UPDATE hall set C = '--' where C = "+seat+"";
                    statement.executeUpdate(insertQuery2);
                    String insertQuery3 = "UPDATE hall set D = '--' where D = "+seat+"";
                    statement.executeUpdate(insertQuery3);
                    String insertQuery4 = "UPDATE hall set E = '--' where E = "+seat+"";
                    statement.executeUpdate(insertQuery4);
                    String insertQuery5 = "UPDATE hall set F = '--' where F = "+seat+"";
                    statement.executeUpdate(insertQuery5);
                    String insertQuery6 = "UPDATE hall set G = '--' where G = "+seat+"";
                    statement.executeUpdate(insertQuery6);
                    String insertQuery7 = "UPDATE hall set H = '--' where H = "+seat+"";
                    statement.executeUpdate(insertQuery7);
                    String insertQuery8 = "UPDATE hall set I = '--' where I = "+seat+"";
                    statement.executeUpdate(insertQuery8);
                    String insertQuery9 = "UPDATE hall set J = '--' where J = "+seat+"";
                    statement.executeUpdate(insertQuery9);

                }

                    System.out.println("==========================");
                    System.out.println(" Your Booking confirmed !!");
                    System.out.println("==========================");

                    System.out.println("Do you want to continue booking (yes = 1)/(no = 0)");
                    choise = n.nextInt();
                     
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
}