import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null; // объект для коннректа с базой данных
        Statement statement = null; //объект для совершения запросов
        ResultSet resultSet = null; //объект

        try {
            Class.forName("org.postgresql.Driver"); //

            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/books", "postgres", "postgres");

            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM books ");

            while (resultSet.next()) {
                String value = resultSet.getString("author");
                System.out.println(value);
            }
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
