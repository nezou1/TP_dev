public class InverseTableau {

    /*
     * Retourne un tableau contenant les éléments de tab mais dans l'ordre inverse.
     */
    public static int[] créeTableauInversé(int[] tab) {
        int longueur = tab.length;
        int[] tabInversé = new int[longueur];
        for (int i=0 ; i< longueur ; i++) {
            tabInversé[i] = tab[longueur-i-1];
        }
        return tabInversé;
    }

    /*
     * Inverse l'ordre des éléments de tab.
     */
    public static void inverseTableau(int[] tab) {
        int pivot;
        int longueur = tab.length;
        for (int i=0 ; i < longueur/2 ; i++) {
            pivot = tab[i];
            tab[i] = tab[longueur-i-1];
            tab[longueur-i-1] = pivot;
        }
    }

    public static void main(String[] args){
        int[] t = {2,4,6,8};
        int[] tab = {2,4,6,8};
        créeTableauInversé(tab);
        inverseTableau(t);

        for(int val:t){
            System.out.print(val+"\t");
        }
        System.out.println();
        for(int val:tab){
            System.out.print(val+"\t");
        }
    }

}
