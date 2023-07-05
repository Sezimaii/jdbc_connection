//package taskmanager;
//
//import java.sql.*;
//import java.util.List;
//import java.util.Scanner;
//
//public class Task {
//    private static String username = "postgres";
//    private static String password = "postgres";
//    private static String url = "jdbc:postgresql://localhost:5432/books";
//    private static List<Task1> tasks;
//    private static Scanner scanner;
//    private static Connection connection;
//
//
//    public static void main(String[] args) throws Exception{
//        Scanner scanner = new Scanner(System.in);
//
//        //Connection connection = DriverManager.getConnection(username, password, url);
//
//
//        while (true){
//            System.out.println(" Task Manager ");
//            System.out.println("1. Создать задачу");
//            System.out.println("2. Просмотреть список задач");
//            System.out.println("3. Редактировать задачу");
//            System.out.println("4. Удалить задачу");
//            System.out.println("5. Отметить задачу как выполненную");
//            System.out.println("6. Установить статус задачи");
//            System.out.println("0. Выход");
//            System.out.print("Выберите действие: ");
//            int choice = scanner.nextInt();
//
//            if (choice == 1){
//                Statement statement = connection.createStatement();
//                String SQL_SELECT_TASK = "select * from task order by id desc";
//                ResultSet result = statement.executeQuery(SQL_SELECT_TASK);
//            while (result.next())
//                System.out.println(result.getInt("ID") + " " + result.getString("title" + " " + result.getString("description")));
//            }else if(choice == 0){
//                System.exit(0);
//
//            }
//        }
//    }
//}
//
//
// class TaskManager {
//    private Connection connection;
//    String url = "jdbc:postgresql://localhost:5432/books";
//    String user = "postgres";
//    String password = "postgres";
//
//    public TaskManager() {
//        // Установить соединение с базой данных
//        try {
//            Class.forName("org.postgresql.Driver");
//            connection = DriverManager.getConnection(url, user, password);
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//
