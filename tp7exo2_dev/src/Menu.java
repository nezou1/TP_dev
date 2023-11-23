import java.util.Scanner;

public class Menu {

    public static void menu(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        double degre;
        int choix;

        do {
            System.out.println("MENU:");
            System.out.println("1. Afficher sa conversion en degrés celsius");
            System.out.println("2. Afficher sa conversion approchée en degrés celsius sous forme d'un entier.");
            System.out.println("3. Retourne sa conversion en degrés celsius");
            System.out.println("4. Retourne si l'eau est glacé");
            System.out.println("5. Retourne si il y'a un danger de glisser ou non");
            System.out.println("6. Retourne si l'eau bout");
            System.out.println("7. Retourne si l'eau est liquide");

            System.out.println("8. Quitter");

            System.out.print("choix: ");
            choix = sc.nextInt();

            System.out.println("Entrez un nombre correspondant a la temperature en Farenheit:");
            degre= sc.nextDouble();

            if(choix>8 || choix<1){
                System.out.println("ERREUR: Choix inexistant ");
                return;
            }

            switch (choix) {

                case 1:
                    CelsiusAndFarenheit.afficherFenC(degre);
                    break;

                case 2:
                    CelsiusAndFarenheit.afficherFenCApprox((int)degre);
                    break;

                case 3:
                    System.out.println(CelsiusAndFarenheit.convertirFenC(degre));
                    break;

                case 4:
                    System.out.println(CelsiusAndFarenheit.çaGèleEnF(degre));
                    break;

                case 5:
                    System.out.println(CelsiusAndFarenheit.çaGlisseEnF(degre));
                    break;

                case 6:
                    System.out.println(CelsiusAndFarenheit.çaBoutEnF(degre));
                    break;

                case 7:
                    System.out.println(CelsiusAndFarenheit.eauLiquideEnF(degre));
                    break;

                case 8:
                    System.out.println("Au revoir :)");
                    return;

            }
        }while(choix>0 && choix <9);

    }
}

