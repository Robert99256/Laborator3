
import java.util.ArrayList; // Pentru lista dinamica (List)
import java.util.List;      // Interfața List
import java.util.Random;    // Pentru generarea numerelor aleatorii
import java.util.HashSet;   // Pentru setul de tip HashSet (fără duplicate)


public class Main {
    public static void main(String[] args) {

        // Creează o listă de numere întregi (goală inițial)
        List<Integer> numere = new ArrayList<>();

        // Creează un obiect Random pentru generare de numere aleatoare
        Random random = new Random();

        // Generează 15 numere întregi aleatoare între 0 și 99 și le adaugă în listă
        for (int i = 0; i < 15; i++) {
            numere.add(random.nextInt(100)); // random.nextInt(100) generează un număr între 0 și 99
        }

        // Parcurge lista de numere și le afișează în consolă
        for (int num : numere) {
            System.out.println(num); // Afișează fiecare număr generat
        }

        // Creează un set HashSet pentru a stoca valori de tip String (nu permite duplicate)
        HashSet<String> set = new HashSet<>();

        // Adaugă două elemente în set
        set.add("TEST1");
        set.add("TEST2");


        // Parcurge și afișează toate elementele din set
        for (String element : set) {
            System.out.println(element); // Ordinea poate fi diferită de cea de inserare
        }
    }
}
