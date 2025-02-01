public class Aufgabensammlung {

    public static void main(String[] args) {
        System.out.println("Hallo. Ich habe einige Aufgaben für den Einstieg in die Programmierung vorbereitet.\n" +
                "Fragen können jederzeit gestellt werden! Ich werde mich bemühen eine geeignete Antwort zu geben.\n" +
                "Viel Spaß bei der Bearbeitung!"
        );

    }

    /**
     * Aufgabe 1 und 2 (Ergebnis, Datentyp des Ergebnis und kurze Erklärung):
     *
     * (1) 1 * 3.0 / 3;
     * (2) int 4.5;
     * (3) "10" + 6;
     * (4) double d = (int) 1.9;
     * (5) long int = 2021;
     * (6) int randnumber = Math.random()*10;
     *
     */

    /**
     * Aufgabe 3:
     * a) Code erklären
     * b) Die Methode so umschreiben, dass eine while-Schleife benutzt und ein double-Wert zurückgegeben wird.
     *
     * Hinweis:
     * Das int[]-Array array ist unsortiert und enthaelt n Elemente
     *
     */

    public static int myfunction(int[] array){
        int min = array[0];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max - min;
    }

    /**
     * Aufgabe 4 (Methoden):
     * a.1) Methode "countStringOccurrence" schreiben, die angibt, wie oft ein Teilstring t in einem String s enthalten ist.
     * a.2) Methode "myHiddenWord" schreiben, die das versteckte Wort in einem String s findet und zurückgibt.
     *
     * b.1) Methode "findMaxAndSubtract" schreiben, die die Differenz des Maximums mit den restlichen Werten im Array zurückgibt.
     * b.2) Methode "deleteMinMax" schreiben, die das Min- und Maximum in einem Array durch eine 0 ersetzt; Rückgabe des Arrays.
     *
     * Hinweis:
     * a.1):
     * - Der String s ist immer laenger als der Teilstring t und verhindert damit eine Fehlermeldung.
     * - Beispiel: String s = "abaababbbababb" und Teilstring t = "ab" -> 5
     *
     * a.2):
     * - Das Wort besteht ausschließlich aus Großbuchstaben und
     * - die einzelnen Buchstaben können auch verstreut im String vorhanden sein, d.h. nicht unmittelbar hintereinander.
     * - Beispiel(e): (1) String s1 := "welcomeHOMEagain" -> HOME; (2) String s2 = "kUndeNinformatIon" -> UNI
     *
     * b.1):
     * - Das Maximum soll nicht von sich selbst subtrahiert werden.
     * - Beispiel: int[]-Array := {5,4,1,2,6,50,4,2}; Maximum ist 50; Differenz ist 26, da 50-i[0]-i[1]-...-i[n] = 26
     *
     * b.2):
     * - Das mögliche int[]-Array array ist unsortiert und enthaelt n Elemente.
     * - Dabei können Werte mehrfach vorkommen, d.h. auch Min und Max des Arrays.
     *
     */

    /**
     * Aufgabe 5 (Rekursion):
     * c.1): rekursive Methode "recLength" schreiben, die die Laenge eines String s zurückgibt. Dabei gilt:
     * (1) 0, falls s leer ist
     * (2) 1 + recLength(s.length()-1), falls s nicht leer ist
     *
     * c.2) rekursive Methode "recSumValue" schreiben, die die Summe eines int-Wertes value bis 0 (jew. inkl.) wie folgt berechnet:
     * (1) 0, falls value 0 ist
     * (2) value + recSumValue(value-1), falls n > 0
     *
     * c.3) rekursive Methode "recSumArray" schreiben, die die Summe der Elemente in einem Array zurückgeben soll. Es gilt:
     * (1) 0, falls Array leer ist
     * (2) Wert an Position -1 im Array + recSum(neues Array mit Länge n-1 des "alten" Arrays)
     *
     * Hinweis:
     * c.1):
     * - Es bietet sich an, den String s vom Anfangs- bis zum Endbuchstaben sukzessive zu kürzen
     * - Beispiel: String s1 := "Studi" -> 5, da (1 + "Studi") + (1 + "udi") + ... + (1 + "i") + (0 + "") = 5
     *
     * c.2):
     * - Der Parametertyp von value ist Integer und value > 0
     * - Beispiel(e): (1) int value1 := 5 -> 15, da 5 + 4 + 3 + 2 + 1 + 0 = 15; (2) int value2 := 9 -> 45
     * - Welche Modifikation/en kann/können umgesetzt werden, z.B der Parameter value ist negativ, ... ?
     *
     * c.3):
     * - Es gibt verschiedene Möglichkeiten zur Umsetzung, z.B. die Nutzung der copyOf()-Methode für Arrays.
     * - Beispiel: int[] array := {3,1,6,4,3,5,9} -> 31;
     * - Modifikation: Was müsste geändert werden, falls das Array selbst kleinere Arrays enthält, um die Summe auszugeben?
     */

    /**
     * Aufgabe 6 (abstrakte Klassen):
     * (1) abstrakte Klasse "Prüfung" schreiben, die Klassen "Klausur" und "Mündlich" erweitern die Klasse "Prüfung".
     * (2) Prüfung:
     * (2.1) Klasse enthält ein Fach und eine ID, die mit jeder Objekterzeugung erhöht werden soll.
     * (3) Klausur:
     * (3.1) Klasse enthält eine boolean-Klassenvariablen anmeldung und geschrieben.
     * (3.2) Die beiden Variablen haben bei der Erzeugung eines Klausur-Objekt false als boolean-Wert.
     * (3.3) Zudem sind zwei Methoden "anmelden" und "schreiben" beinhaltet, die den Wahrheitswert je nach übergebenen Parameter ändern kann.
     * (4) Mündlich:
     * (4.1) Klasse enthält ein Datum (Parametertyp: int) und zudem
     * (4.2) eine Methode "datumsaenderung", die es erlaubt, das Datum jederzeit zu ändern.
     * (5) Die Klassen Klausur UND Mündlich enthalten jeweils eine toString()-Methode, die einen angemessenen String zurückliefert.
     * (6) Testmethode schreiben
     * (6.1) Es soll jeweils ein Objekt der beiden Klassen erzeugt werden.
     * (6.2) Nun liegt auch eine Anmeldung zur Klausur vor, folglich muss der boolean-Wert geändert werden.
     * (6.3) Das Datum der mündlichen Prüfung ist nicht korrekt. Der Termin verschiebt sich um zwei Wochen in die Zukunft.
     * (6.4) Aufruf der beiden toString()-Methoden vor und nach den jeweiligen Änderungen.
     */

    /**
     * Aufgabe 7 (Queue, Stack):
     * (1) Queue:
     * Die Klasse "Queue" weist eine (Teil-)Implementierung einer Schlange (Queue) auf, die in Form eines int[]-Arrays vorzufinden ist.
     *
     * (2) Stack:
     * Die Klasse "Stack" weist widerum eine Implementierung eines Stapels (Stack) auf, der auch als int[]-Array dargestellt ist.
     *
     * Hinweis:
     * - Es soll sich vorerst ein Überblick verschaffen und die Funktionsweise bzw. weitere Details jeweils verstanden werden.
     * - Die beiden Klassen lassen es zu, dass zusätzliche Einzelheiten, wie Methoden, und Modifikationen ergänzt werden können.
     * - Der Programmcode kann deshalb individuell zur Übung überarbeitet werden und stellt keine Muster-Implementierung dar.
     *
     */

    /**
     * Aufgabe 8 (File I/O und Exception):
     *
     * Die Klasse "FileIO" enthält zwei Methoden und eine Main-Methode, die beide Methoden ausschließlich aufruft.
     * Es werden zwei methodenabhängige, d.h. unterschiedliche .txt-Dateien erstellt, wenn die main-Methode ausgeführt wird.
     * Dabei sind die Methoden wie folgt implementiert (Details siehe Ausgabe):
     *
     * Methode 1:
     * Die Methode generiert zwei zufällige int-Werte für eine Zeile in der Datei. Der Parameter n bestimmt dabei die Zeilenanzahl.
     * Methode 2:
     * Die Methode generiert wiederum eine feste Anzahl an gewissen Sätzen. Der Parameter n wird dadurch hier nicht benötigt.
     *
     * Übung:
     * (1) Methode schreiben, die die Summe der Zeilen zurückgeben soll.
     * (2) Methode schreiben, die die Sätze beginnend mit dem kürzesten Satz sukzessive zurückgibt.
     *
     * Hinweis:
     * - Ein geeignetes Exception-Handlung soll in jeder der beiden Methden betrieben werden.
     * - Es ist ausreichend, wenn eine allgemeine Exception geworfen wird.
     *
     */

    /**
     * Aufgabe 9 (Listen und Collections):
     *
     * Es ist die Klasse "Liste" vorgegeben. Sie erstellt eine Liste (hier: ArrayList) und enthält bereits einige Methoden.
     * Ein Blick in den Programmcode hilft beim Verständnis und sollte VOR der Bearbeitung erfolgen.
     *
     * Übung:
     * (1) Es sind einige (wichtige) Methoden nicht vollständig implementiert worden. Das liegt an einem Übertragungsfehler.
     * Die Dokumentation (JavaDoc) zu jeder Methode liefert Hinweise zu einer möglichen bzw. der beabsichtigten Implementierung.
     *
     * (2) Die Hauptklasse "MainklasseListe" enthält eine main-Methode, die es geeignet zu gestalten gilt.
     * - Es soll vorerst ein Liste-Objekt mit einer zulässigen Länge instanziiert, d.h. erstellt, werden.
     * - Dann sollen die vorgegebenen sowie überarbeiteten Methoden auf ihre Richtigkeit überprüft werden.
     *
     * Hinweis:
     * - Die Ausgestaltung/Implementierung der zu überarbeitenden Methoden in (1) ist frei wählbar; Hinweise können helfen
     * - Der Test in (2) kann individuell gestaltet werden, es gibt keine Vorgaben und auch keine "beste" Lösung.
     *
     */


}
