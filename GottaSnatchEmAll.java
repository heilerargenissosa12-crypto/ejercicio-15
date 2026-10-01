package playgroundsets;

import java.util.List;
import java.util.Set;

/**
 * En el repositorio oficial de Exercism Java, este ejercicio de Sets
 * se titula "Gotta Snatch 'Em All".
 * Esta clase proporciona acceso idéntico con ese nombre.
 */
public class GottaSnatchEmAll extends PlaygroundSets {
    public static Set<String> newCollection(List<String> cards) {
        return PlaygroundSets.newCollection(cards);
    }
    public static boolean addCard(String card, Set<String> collection) {
        return PlaygroundSets.addCard(card, collection);
    }
    public static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return PlaygroundSets.canTrade(myCollection, theirCollection);
    }
    public static Set<String> commonCards(List<Set<String>> collections) {
        return PlaygroundSets.commonCards(collections);
    }
    public static Set<String> allCards(List<Set<String>> collections) {
        return PlaygroundSets.allCards(collections);
    }
}
