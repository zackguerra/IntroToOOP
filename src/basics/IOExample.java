package basics;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        // Write a program to say hello inn each language.
        // "en" - English
        // "br" - Portuguese
        // "es" - Spanish
        // "sk" - Slovak
        // "jp" - Japanese

        Scanner in = new Scanner(System.in);
        System.out.println("Choose the language (en, br, es, sk, jp):  ");
        String countryCodde = in.nextLine();  // same as input() in python
        switch(countryCodde){
            case "en":
                System.out.println("Hello");
                break;
            case "br":
                System.out.println("Oi");
                break;
            case "es":
                System.out.println("Ola");
                break;
            case "sk":
                System.out.println("Ahoi");
                break;
            case "jp":
                System.out.println("Konnichiwa");
                break;
            default:
                break;
        }


    }
}
