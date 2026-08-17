# java-studies

Learning repo — Java OOP fundamentals, built while studying the language.

## What's here

`java-poo/` — **Platzi Play**, a console app that manages a small movie catalogue.
It's a vehicle for practising object-oriented design rather than a product:

- **Encapsulation** — `Movie`, `Platform` and `User` with private state and behaviour.
- **Enums** — `Genre`, `Quality`, `Language`.
- **Records** — `SummaryContent` as an immutable data carrier.
- **Custom exceptions** — `ExistingMovieException` for duplicate titles.
- **Collections & streams** — search by name and genre, ordering by rating.
- **Utilities** — `ScannerUtils` for console input.
- `MainStackHeap.java` — a separate exercise on how the JVM lays out values on
  the stack versus the heap.

## Menu

```
1. Add movie          4. Search movies by genre
2. Show movies        5. Get movies ordered by rating
3. Search by name     6. Delete movie
```

## Running it

An IntelliJ IDEA project (no build tool). Open `java-poo/` in the IDE and run
`platzi.play.Main`. From the command line:

```bash
cd java-poo
javac -d out $(find src -name "*.java")
java -cp out platzi.play.Main
```

Requires JDK 17+ (the code uses text blocks and records).

## Stack

Java · OOP · Collections · Streams
