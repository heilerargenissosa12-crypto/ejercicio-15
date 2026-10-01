package playgroundsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 15: Playground Sets (Sets)");
        System.out.println("==================================================");

        // 1. Nueva colección sin duplicados
        List<String> rawCards = Arrays.asList("Pikachu", "Charizard", "Pikachu", "Mewtwo");
        Set<String> myCol = PlaygroundSets.newCollection(rawCards);
        System.out.println("1. Coleccion sin duplicados: " + myCol + " (Tamano: " + myCol.size() + ", Esperado: 3)");

        // 2. Agregar carta
        boolean addedNew = PlaygroundSets.addCard("Bulbasaur", myCol);
        boolean addedDup = PlaygroundSets.addCard("Pikachu", myCol);
        System.out.println("2. Agregar Bulbasaur (nueva): " + addedNew + " (Esperado: true)");
        System.out.println("   Agregar Pikachu (repetida): " + addedDup + " (Esperado: false)");

        // 3. Intercambio posible
        Set<String> friendCol = PlaygroundSets.newCollection(Arrays.asList("Squirtle", "Charizard"));
        boolean canTrade = PlaygroundSets.canTrade(myCol, friendCol);
        System.out.println("3. Se puede intercambiar con amigo? " + canTrade + " (Esperado: true)");

        // 4. Cartas comunes
        List<Set<String>> allCols = new ArrayList<>();
        allCols.add(myCol);
        allCols.add(friendCol);
        Set<String> common = PlaygroundSets.commonCards(allCols);
        System.out.println("4. Cartas comunes (interseccion): " + common + " (Esperado: [Charizard])");

        // 5. Todas las cartas únicas
        Set<String> all = PlaygroundSets.allCards(allCols);
        System.out.println("5. Todas las cartas (union): " + all + " (Tamano: " + all.size() + ", Esperado: 5)");

        boolean ok = myCol.size() == 4 && addedNew && !addedDup && canTrade && common.contains("Charizard") && all.size() == 5;
        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
