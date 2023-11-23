import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner sc = new  Scanner(System.in).useDelimiter("\n");

        double note=0;
        double somme=0;
        double moy=0;

        System.out.println("Veuillez entrer le nombre d'étudiants de votre promo");

        int nbEtudiants = sc.nextInt();
        double[] tab = new double[nbEtudiants];


        for(int i=0; i<tab.length;i++){
            System.out.println("Veuillez entrer une note");
            note = sc.nextDouble();
            tab[i]=note;
        }

        for(int i=0; i<tab.length;i++){
            somme=somme+tab[i];
        }
        moy=somme/ tab.length;
        System.out.println("La moyenne de la promo est:"+moy);

    }
}
