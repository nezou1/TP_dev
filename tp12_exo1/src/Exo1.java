public class Exo1 {

    public static void afficherMatrice(int[][] t) {



        // boucle qui parcourt les lignes à afficher

        for (int i = 0 ; i < t.length ; i++) {



            // boucle qui, pour chaque ligne, parcourt les colonnes

            for (int j = 0 ; j < t[i].length ; j++){

                // affichage du contenu de la case située à la

                // ligne d’indice i et à la colonne d’indice j

                System.out.print(t[i][j] + "\t");

            }

            System.out.println();

        }

    }

    /*

     * Copie la valeur val dans toutes les cases du tableau.

     */

    public static void remplir (int[][] t , int val) {

        for(int i=0; i<t.length;i++){
            for(int j=0; j<t[i].length;j++){
                t[i][j] = val;
            }
        }
        System.out.println();
    }

    /*

     * Remplit la matrice m avec
     * la valeur 1 sur la diagonale hautGauche-basDroit
     * et la valeur 0 partout ailleurs.
     * m doit être une matrice carrée
     * (les deux dimensions doivent être de même longueur).

     */
    public static void remplirMatriceAvecDiagonale (int[][] m){

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(i == j){
                    m[i][j]=1;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {



        // déclaration, création et initialisation

        // d’un tableau à deux dimensions

        // qui représente une matrice

        // de hauteur 3 (la matrice comporte trois lignes)

        // de largeur 4 (la matrice comporte quatre colonnes)

        int[][] mat = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} };

        afficherMatrice(mat);



        int[][] mat2 = new int[4][4];
        remplir(mat2, 3);
        afficherMatrice(mat2);

        int[][] mat3 = new int[5][5];
        remplirMatriceAvecDiagonale(mat3);
        afficherMatrice(mat3);

    }

}
