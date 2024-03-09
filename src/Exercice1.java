import java.util.Scanner;
public class Exercice1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le nombre N : ");
            int N = scanner.nextInt();
            int sommeWhile = 0;
            int produitWhile = 1;
            int iWhile = 0;

            System.out.println("Utilisation de la boucle while:");
            while (iWhile < N) {
                System.out.print("Entrez un nombre : ");
                int nombre = scanner.nextInt();

                sommeWhile += nombre;
                produitWhile *= nombre;

                iWhile++;
            }

            double moyenneWhile = (double) sommeWhile / N;
            System.out.println("Somme : " + sommeWhile);
            System.out.println("Produit : " + produitWhile);
            System.out.println("Moyenne : " + moyenneWhile);
            int sommeDoWhile = 0;
            int produitDoWhile = 1;
            int iDoWhile = 0;

            System.out.println("\nUtilisation de la boucle do-while:");
            do {
                System.out.print("Entrez un nombre : ");
                int nombre = scanner.nextInt();

                sommeDoWhile += nombre;
                produitDoWhile *= nombre;

                iDoWhile++;
            } while (iDoWhile < N);

            double moyenneDoWhile = (double) sommeDoWhile / N;
            System.out.println("Somme : " + sommeDoWhile);
            System.out.println("Produit : " + produitDoWhile);
            System.out.println("Moyenne : " + moyenneDoWhile);
            int sommeFor = 0;
            int produitFor = 1;

            System.out.println("\nUtilisation de la boucle for:");
            for (int iFor = 0; iFor < N; iFor++) {
                System.out.print("Entrez un nombre : ");
                int nombre = scanner.nextInt();

                sommeFor += nombre;
                produitFor *= nombre;
            }

            double moyenneFor = (double) sommeFor / N;
            System.out.println("Somme : " + sommeFor);
            System.out.println("Produit : " + produitFor);
            System.out.println("Moyenne : " + moyenneFor);

            scanner.close();
        }
    }
