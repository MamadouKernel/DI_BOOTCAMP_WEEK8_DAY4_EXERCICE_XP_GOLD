import exercice1.Exercice1;
import exercice2.Exercice2;

public class Main {
    public static void main(String[] args) {
        //Exercice 1
        System.out.println("Affected rows for update: " + Exercice1.updateData());

        //Exercice 2
        System.out.println("Affected rows for delete: " + Exercice2.deleteData());
    }
}
