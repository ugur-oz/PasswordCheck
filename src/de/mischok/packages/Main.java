package de.mischok.packages;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int counter = 0;
        boolean gb = false;
        boolean kb = false;
        boolean zif = false;
        boolean son = false;

        System.out.println(" *** Wilkommen Ihr Password Checker *** ");
        System.out.println("Bitte geben Sie Ihr Password ein");

        Scanner password = new Scanner(System.in);
        String input = password.nextLine();


        if (input.length() < 10) {
            System.out.println("Das Password soll mindestens aus 10 Zeichen bestehen");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c) && gb == false) {
                gb = true;
                counter++;
            }
            if (Character.isLowerCase(c) && kb == false) {
                kb = true;
                counter++;
            }
            if (Character.isDigit(c) && zif == false) {
                zif = true;
                counter++;
            }
            if (c >= 33 && c <= 46 || c == 64 && son == false) {
                son = true;
                counter++;
            }
        }
        if (counter > 2) {
            System.out.println("Password ist gespeichert");
        } else {
            System.out.println("Password soll 3 von denen beinhalten -Großbuchstaben - Kleinbuchstaben -Ziffern -Sonderzeichen");
        }
    }
}


