package fr.github.quenk.calculatrice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nombreUn;
        int nombreDeux;
        String operateur;
        int resulat = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue sur la petite calculatrice de QuenK.");
        System.out.println("Veuillez entrer votre premier nombre:");
        nombreUn = scanner.nextInt();
        System.out.println("Veuillez entrer votre opérateur:");
        operateur = String.valueOf(scanner.next().charAt(0));
        System.out.println("Veuillez entrer votre deuxième nombre:");
        nombreDeux = scanner.nextInt();
        switch(operateur){
            case "*":
                resulat = nombreUn * nombreDeux;
                break;
            case "-":
                resulat = nombreUn - nombreDeux;
                break;
            case "+":
                resulat = nombreUn + nombreDeux;
                break;
            case "/":
                resulat = nombreUn / nombreDeux;
                break;
            default :
                System.out.println("Opérateur non trouvé.");
                scanner.close();
                break;

        }
        System.out.println("résultat:" +resulat);
        scanner.close();
    }
}
