package exercice1;

import database.Connexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
    In this exercise you will use the UPDATE statement to update any record and then fetch and display updated records from the COMPANY table table using PostgreSQL JDBC
    Create a database connection to the PostgreSQL server.
    Create a Statement object.
    Execute a statement to update records
    UPDATE COMPANY set SALARY = 25000.00 where ID=1;
    Close the database connection.
*/
public class Exercice1 {
    public static int updateData() {
        final String SQL = """
                    UPDATE company
                    SET salary = 25000.00
                    WHERE id = 1
                """;
        int affectedRow = 0;

        try {
            Connection connection = new Connexion().getConnecion();
            Statement statement = connection.createStatement();
            affectedRow = statement.executeUpdate(SQL);

            if (affectedRow == 0) {
                System.out.println("Aucune ligne n'a été modifiée!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return affectedRow;
    }
}
