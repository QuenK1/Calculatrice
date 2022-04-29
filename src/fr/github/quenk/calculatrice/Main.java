package fr.github.quenk.calculatrice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nombreUn;
        int nombreDeux;
        int resulat;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue sur la petite calculatrice de QuenK.");
        System.out.println("Veuillez entrer votre premier nombre:");
        nombreUn = scanner.nextInt();
        System.out.println("Veuillez entrer votre deuxième nombre:");
        nombreDeux = scanner.nextInt();

        resulat = nombreUn+nombreDeux;
        System.out.println("Voici votre résultat: "+resulat);

    }
}
