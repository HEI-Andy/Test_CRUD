package Code;

import java.sql.*;
import java.util.Scanner;

public class studentRepositories {
    private static final String url = "jdbc:postgresql://localhost:5432/hei";
    private static final String user = "postgres";
    private static final String password = "root123";

    static Scanner myObj= new Scanner(System.in);

    public static int insert(student a){
        try{
            Scanner myScan= new Scanner(System.in);
            int numéro= myScan.nextInt();
            String nom= myScan.next();
            String prénom= myScan.next();
            Connection octon= DriverManager.getConnection(url, user, password);
            PreparedStatement state;
            state = octon.prepareStatement("insert into student values(?,?,?)");
            state.setInt(1,numéro);
            state.setString(2,nom);
            state.setString(3,prénom);
            state.executeUpdate();
            if(state.execute()){
                System.out.println("student inséré");
            }
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        return a.getStd();
    }

    public static Object select(int std) throws SQLException {
        Connection octon= DriverManager.getConnection(url, user, password);
        PreparedStatement state;
        try{
            state = octon.prepareStatement("select nom_student from student where std=?");
            state.setInt(1, std);
            ResultSet RESULT =state.executeQuery();
            while (RESULT.next()) {
                System.out.println(RESULT.getString("std"));
                System.out.println(RESULT.getString("nom_student"));
                System.out.println(RESULT.getString("prénom_student"));
            }
            RESULT.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void update(){
        try{
            Connection octon= DriverManager.getConnection(url, user, password);
            Scanner myScan= new Scanner(System.in);
            int numéro= myScan.nextInt();
            PreparedStatement state;
            state = octon.prepareStatement("update student set std=? where std=?");
            state.setInt(1,numéro);
            state.executeUpdate();
            if(state.execute()){
                System.out.println("updated");
            }
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void delete(){
        try{
            Connection octon= DriverManager.getConnection(url, user, password);
            Scanner myScan= new Scanner(System.in);
            PreparedStatement state;

            state = octon.prepareStatement("delete from student where std=21001");

            if(state.execute()){
                System.out.println("student deleted");
            }
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
