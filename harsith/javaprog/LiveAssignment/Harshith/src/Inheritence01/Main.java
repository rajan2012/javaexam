package Inheritence01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonA personA = new PersonA("Person", "A");
        PersonB personB = new PersonB("Person", "B") ;

        System.out.print("How much words for Person A? ");
        int wordsA = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < wordsA; i++) {
            personA.learn(sc.nextLine());
        }

        System.out.print("How much words for Person b? ");
        int wordsB = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < wordsB; i++) {
            personB.learn(sc.nextLine());
        }


        System.out.println(personA + " knows " + personA.getNumberOfWords() + " word(s).");
        System.out.println(personB + " knows " + personB.getNumberOfWords() + " word(s).");
    }
}
