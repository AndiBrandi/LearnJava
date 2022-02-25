package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main_jdbc {

    public static void main(String[] args) {


        try {
            // Connection aufbauen
            Connection connection = Database.getInstance();

            // SQL Statement schreiben
            PreparedStatement statement = connection.prepareStatement("SELECT title,description FROM phuber1_Filme");

            // Antwort von DB in ResultSet speichern
            ResultSet resultSet = statement.executeQuery();

            // Irgendwas mit den Daten anfangen


            while (resultSet.next()) {
                System.out.println(resultSet.getString("title"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
