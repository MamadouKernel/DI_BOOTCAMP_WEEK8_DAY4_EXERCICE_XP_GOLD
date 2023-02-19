package exercice2;

import database.Connexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
    In this exercise you will use the DELETE statement to delete any record and then fetch and display the remaining records from the COMPANY table using PostgreSQL JDBC
    Create a database connection to the PostgreSQL server.
    Create a Statement object.
    Execute a statement to delete records
    DELETE from COMPANY where ID = 2;
    Close the database connection.
*/
public class Exercice2 {
    public static int deleteData() {
        final String SQL = """
                    DELETE FROM company
                    WHERE id = 2
                """;
        int affectedRow = 0;

        try {
            Connection connection = new Connexion().getConnecion();
            Statement statement = connection.createStatement();
            affectedRow = statement.executeUpdate(SQL);

            if (affectedRow == 0) {
                System.out.println("Erreur de suppression!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return affectedRow;
    }
}
