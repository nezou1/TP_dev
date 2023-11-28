public class TableauxDimensionSuperieure {

    public static int nbTrueDim2(boolean[][] t) {
        int compteur = 0;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j]) {
                    compteur++;
                }
            }
        }
        return compteur;
    }

    public static int nbTrueDim4(boolean[][][][] t) {
        int compteur = 0;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                for (int k = 0; k < t[i][j].length; k++) {
                    for (int l = 0; l < t[i][j][k].length; l++) {
                        if (t[i][j][k][l]) {
                            compteur++;
                        }
                    }
                }

            }
        }
        return compteur;
    }

    public static boolean estPresentDim2(int[][] t, int val){
        boolean bool=false;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length && !bool; j++) {
                if (t[i][j] == val) {
                    bool=true;
                    break;
                }
            }
        }
        return bool;
    }

    public static boolean estPresentDim4(int[][][][] t, int val) {
        boolean bool = false;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                for (int k = 0; k < t[i][j].length; k++) {
                    for (int l = 0; l < t[i][j][k].length; l++) {
                        bool = (t[i][j][k][l] == val);

                    }
                }

            }
        }
        return bool;
    }

    public static void mettreLesNégatifsàZéroDim2(int[][] t){

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] < 0) {
                    t[i][j] = 0;
                }
            }
        }
    }

    public static void mettreLesNégatifsàZéroDim4(int[][][][] t){

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                for (int k = 0; k < t[i][j].length; k++) {
                    for (int l = 0; l < t[i][j][k].length; l++) {
                        if(t[i][j][k][l] < 0){
                            t[i][j][k][l] = 0;
                        }

                    }
                }
            }
        }
    }

    public static int[] sommesLignes(int[][] t){

        int somme=0;
        int[] tab = new int[t.length];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                somme = somme + t[i][j];
            }
            tab[i]=somme;
            somme=0;
        }
        return tab;
    }

    public static int[] nbZeroDim2(int[][] t){
        int compteur=0;
        int[] tab = new int[t.length];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] == 0) {
                    compteur++;
                }
            }
            tab[i]=compteur;
            compteur=0;
        }

        for(int val:tab){
            System.out.println(val);
        }
        return tab;
    }

    public static boolean[] estPresentZero(int[][] t){
        boolean bool=false;
        boolean[] tab = new boolean[t.length];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length && !bool; j++) {
                if (t[i][j] == 0) {
                    bool=true;
                }
            }
            tab[i]=bool;
            bool=false;
        }

        for(boolean val:tab){
            System.out.println(val);
        }
        return tab;
    }

    public static void main(){
        int[][] tab1 = {{12, 0, 5},{13, 8, 9}};
        nbZeroDim2(tab1);
    }



}