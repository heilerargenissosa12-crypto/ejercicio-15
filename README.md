# Ejercicio 15: Playground Sets (Gotta Snatch 'Em All)

- **Concepto:** Sets (Conjuntos en Java con la interfaz `Set<E>` y `HashSet<E>`)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Administrar una colección de cartas coleccionables donde los duplicados no interesan, aprovechando las propiedades matemáticas de los conjuntos:
1. `newCollection(List<String> cards)`: Crea un `HashSet` eliminando automáticamente los duplicados.
2. `addCard(String card, Set<String> collection)`: Inserta una carta y devuelve `true` si era nueva o `false` si ya existía.
3. `canTrade(Set<String> myCollection, Set<String> theirCollection)`: Determina si ambos jugadores tienen al menos una carta única para intercambiar.
4. `commonCards(List<Set<String>> collections)`: Encuentra la intersección de todas las colecciones (`retainAll`).
5. `allCards(List<Set<String>> collections)`: Encuentra la unión de todas las colecciones (`addAll`).

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
