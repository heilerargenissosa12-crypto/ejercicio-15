package playgroundsets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Ejercicio 15: Playground Sets (Gotta Snatch 'Em All)
 * Concepto: Sets (Conjuntos en Java con la interfaz Set y HashSet)
 *
 * Administra una colección de cartas coleccionables sin duplicados,
 * realizando uniones, intersecciones y diferencias de conjuntos.
 */
public class PlaygroundSets {

    /**
     * Crea un nuevo conjunto a partir de una lista de cartas eliminando duplicados.
     */
    public static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    /**
     * Agrega una carta a la colección.
     * Retorna true si la carta era nueva y se agregó, false si ya existía.
     */
    public static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    /**
     * Determina si es posible un intercambio justo entre dos coleccionistas.
     * Un intercambio es posible si ambos tienen al menos una carta que el otro no tiene.
     */
    public static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> myOnlyCards = new HashSet<>(myCollection);
        myOnlyCards.removeAll(theirCollection);

        Set<String> theirOnlyCards = new HashSet<>(theirCollection);
        theirOnlyCards.removeAll(myCollection);

        return !myOnlyCards.isEmpty() && !theirOnlyCards.isEmpty();
    }

    /**
     * Encuentra las cartas comunes que están presentes en todas las colecciones (intersección).
     */
    public static Set<String> commonCards(List<Set<String>> collections) {
        if (collections == null || collections.isEmpty()) {
            return new HashSet<>();
        }

        Set<String> intersection = new HashSet<>(collections.get(0));
        for (int i = 1; i < collections.size(); i++) {
            intersection.retainAll(collections.get(i));
        }
        return intersection;
    }

    /**
     * Obtiene el catálogo completo de todas las cartas únicas existentes
     * sumando todas las colecciones (unión).
     */
    public static Set<String> allCards(List<Set<String>> collections) {
        Set<String> union = new HashSet<>();
        if (collections != null) {
            for (Set<String> col : collections) {
                union.addAll(col);
            }
        }
        return union;
    }
}
