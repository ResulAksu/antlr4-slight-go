# antlr4-slight-go
Compilerbau Projekt für eine schwache Version von GO

To Do:
## Zum Typechecken

- LocalVariables
    - Variable nicht doppelt deklarieren in einem Scope
    - Variable nicht mit “nicht” deklarierten Variablen deklarieren
    - Ob Variable überhaupt deklariert ist
- Scoping
    - Klammern richtig gesetzt
    - (Keine Methode in einer Methode anfangen)
- Struktur
    - package main
    - import “fmt”
    - func main() vorhanden
- For oder If
    - Syntaxfehler beim Boolean, ob benutzte Variable deklariert ist
- Literals
    - Syntaxfehler bei Literals
- Methodenaufrufe
    - Hat Methode gleich viele Parameter wie beim Aufruf
    - Gibt es die Aufgerufene Methode eigentlich
    - Benutzt Methode richtigen return
