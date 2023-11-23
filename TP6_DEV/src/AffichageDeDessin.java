public class AffichageDeDessin {
    /**

     * Affiche une ligne de caractères (sans retour à la ligne).

     *

     * @param c

     *            le caractère à afficher

     * @param longueur

     *            le nombre d'affichages du caractère (longueur >=0)

     */

    public static void afficherEnLigne(char c, int longueur) {

        if (longueur < 0) {

            System.out.println("ERREUR! afficherEnLigne : longueur négative ("+ longueur + ")");

        } else {

            for (int colonne = 1; colonne <= longueur; colonne++) {

                System.out.print(c);

            }

        }

    }



    /**

     * Affiche une ligne de caractères avec retour à la ligne.

     *

     * @param c

     *            le caractère à afficher

     * @param longueur

     *            le nombre d'affichages du caractère (longueur >=0).

     */

    public static void afficherEnLigneln(char c, int longueur) {

        afficherEnLigne(c, longueur);

        System.out.println();

    }

    /**

     * Affiche un rectangle composé avec le caractère '*'

     *

     * @param largeur

     *            largeur du rectangle (largeur >=0)

     * @param hauteur

     *            hauteur du rectangle (hauteur >=0)

     */

    public static void afficherRectangle(int largeur, int hauteur){
        char c = '*';
        int compteur;
        int i;
        if (largeur < 0 || hauteur <0) {

            System.out.println("ERREUR!");

        } else {
            for (i = 0; i < hauteur; i++) {
                for (compteur = 0; compteur <= largeur; compteur++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }
    /**

     * Affiche un carre composé avec le caractère '*'

     *

     * @param  cote

     *            cote du carre (cote >=0)

     */
    public static void afficherCarre(int cote){
        char c = '*';
        int compteur;
        int i;
        if(cote<0){
            System.out.println("ERREUR!\n");
        }else {
            for (i = 0; i < cote; i++) {
                for (compteur = 0; compteur <= cote; compteur++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }

    /**

     * Affiche un triangle rectangle d'étoiles dont le sommet haut est à gauche.

     *

     * @param hauteur

     *            la hauteur du triangle (hauteur >=0)

     */


    public static void afficherTriangleRectangleGauche(int hauteur){
        char c = '*';
        int j;
        int i;
        if (hauteur <0) {

            System.out.println("ERREUR!");

        } else {
            for (i = 1; i <= hauteur; i++) {
                for (j = 0; j < i; j++){
                    System.out.print(c);
                }
                System.out.println();

            }
        }
    }


    /**

     * Affiche un triangle rectangle d'étoiles dont le sommet sommet haut est à droite.

     *

     * @param hauteur

     *            la hauteur du triangle (hauteur >=0)

     */

    public static void afficherTriangleRectangleDroit(int hauteur) {
        char c = '*';
        int j;
        int i;
        if (hauteur < 0) {

            System.out.println("ERREUR!");

        } else {
            for(i=0;i<hauteur;i++){
                for(j=1;j<=hauteur-i;j++){
                    System.out.print(" ");
                }
                for(j=hauteur-i;j<=hauteur;j++){
                    System.out.print(c);
                }
            System.out.println();
            }
        }
    }

    /**

     * Affiche un triangle isocèle d'étoiles (sommet en haut).

     * (Autrement dit, il s'agit d'une pyramide.)

     *

     * @param hauteur

     *            la hauteur du triangle (hauteur >=0)

     */

    public static void afficherTriangleIsocèle(int hauteur){
        char c = '*';
        int j;
        int i;
        if (hauteur < 0) {

            System.out.println("ERREUR!");

        } else {
            for(i=0;i<hauteur;i++){
                for(j=1;j<=hauteur-i;j++){
                    System.out.print(" ");
                }
                for(j=hauteur-i;j<=hauteur+i;j++){
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }

    /**

     * Affiche un triangle isocèle d'étoiles (base en haut).

     * (Autrement dit, il s'agit d'une pyramide inversée.)

     *

     * @param hauteur

     *            la hauteur du triangle (hauteur >=0)

     */


    public static void afficherTriangleIsocèleInversé(int hauteur) {

        if (hauteur < 0) {
            System.out.println("La hauteur doit être supérieure ou égale à 0.");
            return;
        }

        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * (hauteur - i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /**

     * Affiche l'un en dessous de l'autre un triangle isocèle d'étoiles puis un triangle isocèle d'étoiles inversé.

     *

     * @param demiHauteur

     *            la hauteur de chacun des triangles (hauteur >=0)

     */

    public static void afficherTriangleIsocèleEtTriangleIsocèleInversé(int hauteur){
        char c = '*';
        int j;
        int i;
        if (hauteur < 0) {

            System.out.println("ERREUR!");

        } else {
            for(i=0;i<hauteur;i++){
                for(j=1;j<=hauteur-i;j++){
                    System.out.print(" ");
                }
                for(j=hauteur-i;j<=hauteur+i;j++){
                    System.out.print(c);
                }
                System.out.println();
            }
            if (hauteur < 0) {
                System.out.println("La hauteur doit être supérieure ou égale à 0.");
                return;
            }

            for (i = 0; i < hauteur; i++) {
                for (j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < 2 * (hauteur - i) - 1; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }




    public static void main(String[] args){
        int lng = 5;
        char c = 's';

        afficherEnLigne(c,lng);
        System.out.println();

        afficherEnLigneln(c,lng);
        System.out.println();


        afficherRectangle(8,4);
        System.out.println();

        afficherCarre(4);
        System.out.println();

        afficherTriangleRectangleGauche(5);
        System.out.println();

        afficherTriangleRectangleDroit(4);
        System.out.println();

        afficherTriangleIsocèle(5);
        System.out.println();

        afficherTriangleIsocèleInversé(5);
        System.out.println();

        afficherTriangleIsocèleEtTriangleIsocèleInversé(4);
    }
}
