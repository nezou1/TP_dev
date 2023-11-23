import java.util.Random;

public class MethodesQuiModifientDesTableaux {

    public static int[] raz(int[] tab){

        for(int i=0;i<tab.length;i++){
            tab[i]=0;
        }
        return tab;
    }

    public static void valAbs(int[] tab){

        for(int i=0;i<tab.length;i++){
            if(tab[i]<0){
                tab[i]=-tab[i];
            }
        }
    }

    /*

     * Remplit le tableau avec des valeurs aléatoires comprises entre min inclus et max inclus.

     */

    public static void remplirTableauAvecValeursAléatoires(int[] t, int valMin, int valMax) {

        for(int i=0;i<t.length;i++){
            t[i]= valMin+(int)(Math.random()*((valMax-valMin)+1));
        }
    }

    /*

     * Crée un tableau et le remplit avec des valeurs aléatoires comprises entre min inclus et max inclus.

     */

    public static int[] créerEtRemplirTableauAvecValeursAléatoires(int longueur, int valMin, int valMax){
        int[] tab= new int[longueur];
        remplirTableauAvecValeursAléatoires(tab,valMin,valMax);
        return tab;
    }

    public static void afficheTab(int[] t){
        for(int val:t){
            System.out.print(val+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] tab = créerEtRemplirTableauAvecValeursAléatoires(5,-5,9);
        afficheTab(tab);
        valAbs(tab);
        afficheTab(tab);
        raz(tab);
        afficheTab(tab);
    }



}
