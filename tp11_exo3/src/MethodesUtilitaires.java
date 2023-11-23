import java.util.Scanner;
public class MethodesUtilitaires {

    public static double moyenne(double[] note){
        double somme=0;
        for(double val:note){
            somme=somme+val;
        }
        return (somme/note.length);
    }

    public static void getnote(){
        Scanner sc = new Scanner(System.in);

        int nbEtud;
        double[] note;
        double moyenne;
        System.out.println("Bonjour, Veuillez saisir le nombre d'etudiants :");
        nbEtud = sc.nextInt();
        note = new double[nbEtud];
        System.out.println("Maintenant veuillez saisir les notes :");
        for(int i=0;i< note.length;i++ ){
            System.out.println("Pour l'etudiant" + (i+1));
            note[i]=sc.nextInt();
            while(note[i]>20||note[i]<0){
                System.out.println("Erreur Note incorrect !!");
                note[i]= sc.nextDouble();
            }
        }


    }



}
