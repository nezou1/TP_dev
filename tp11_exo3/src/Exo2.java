import java.util.Scanner;
public class Exo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c; //choix
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

        String menu1 =  " 1. Afficher le nombre d'etudiant " +
                "\n 2. Afficher les notes " +
                "\n 3. Afficher la moyenne de la promo " +
                "\n 4. Saisir un Seuil et verifier les notes  " +
                "\n 5. Quitter";

        System.out.println(menu1);

        c = sc.nextInt();

        while (c < 0 || c >6){
            System.out.print("Erreur de choix");
        }
        while (c < 5) {

            switch (c) {
                case 1:
                    System.out.println("Il y a "+ nbEtud + " etudiant(s)");
                    break;
                case 2:
                    for(int i=0;i<note.length;i++)
                        System.out.println("eleve "+i+" | " + note[i]);
                    break;
                case 3:
                    moyenne = MethodesUtilitaires.moyenne(note);
                    System.out.println("La moyenne de la promo est à : " + moyenne);
                    break;
                case 4:
                    double seuil= sc.nextDouble();
                    for(int i=0;i<note.length;i++)
                        if(note[i]<=seuil) {
                            System.out.println("Toutes les notes ne sont pas superieur au seuil");
                            break;
                        }
                    System.out.println("Ok");
                    break;
                default:System.out.print("Erreur de choix");

            }
            System.out.println(menu1);
            c = sc.nextInt();

        }
        System.out.print("Au revoir !");
    }
}
