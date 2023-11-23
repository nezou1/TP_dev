import java.util.Scanner;

public class GestionnaireDeDessins {
    /*
    * Cette class affiche un menu et propose a l'utilisateur de faire un choix
    * Une fois le choix fait, la methode de la figure en question est appelée
    *
    * */
    public static void selectionDessins(){
        int hauteur;
        int larg;
        int choix;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");


        do {
            System.out.println("MENU:");
            System.out.println("1. afficher un rectangle");
            System.out.println("2. afficher un triangle rectangle gauche");
            System.out.println("3. afficher un triangle rectangle droit");
            System.out.println("4. Quitter");

            System.out.print("choix: ");
            choix = sc.nextInt();

            if(choix>4 || choix<1){
                System.out.println("ERREUR: Choix inexistant ");
                return;
            }

            switch (choix) {

                case 1:
                    System.out.println("Quelle est la hauteur et la largeur du rectangle?");
                    System.out.print("hauteur: ");
                    hauteur = sc.nextInt();
                    System.out.println();
                    System.out.print("largeur: ");
                    larg = sc.nextInt();
                    ServiceDeDessins.afficherRectangle(larg, hauteur);
                    break;

                case 2:
                    System.out.println("Quelle est la hauteur du triangle?");
                    System.out.print("hauteur: ");
                    hauteur = sc.nextInt();
                    ServiceDeDessins.afficherTriangleRectangleGauche(hauteur);
                    break;

                case 3:
                    System.out.println("Quelle est la hauteur triangle?");
                    System.out.print("hauteur: ");
                    hauteur = sc.nextInt();
                    ServiceDeDessins.afficherTriangleRectangleDroit(hauteur);
                    break;

                case 4:
                    System.out.println("Au revoir");
                    return;

            }
        }while(choix>0 && choix <5);

    }
}
