import java.util.Scanner;

public class DiversesMethodesSurDesTableaux {

    static int nbOccurrences (int[] tab, int val){
        int nbOccurences=0;

        for(int i=0;i<tab.length;i++){
            if(tab[i]==val){
                nbOccurences++;
            }
        }

        return nbOccurences;
    }

    static int nbStrictementNégatifs (int[] tab){
        int nbOccurrences = 0;
        for(int i = 0; i< tab.length;i++){
            if(tab[i]<0){
                nbOccurrences++;
            }
        }

        return nbOccurrences;
    }
    static int sommeValeurs (int[] tab){
        int somme = 0;
        for(int i = 0; i< tab.length;i++){

            somme=somme+tab[i];

        }
        return somme;

    }

    static boolean estPrésent (int[] tab, int val){

        int i=0;
        boolean presence = false;

        while(i< tab.length && !presence){
            if(tab[i]==val){
                presence = true;
            }i++;
        }
        return presence;
    }

    static boolean tousPositifs (int[] tab){
        boolean positif=true;

        for(int i=0;i< tab.length;i++){
            if(tab[i]<0){
                positif=false;
                break;
            }
        }
        return positif;
    }

    public static void main(String[]  args){

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Combien de note souhaitez vous entrer?");
        int nbNotes = sc.nextInt();
        int[] tab = new int[nbNotes];

        for(int i=0;i<tab.length;i++){
            System.out.println("Veuillez entrer une note:");
            int note = sc.nextInt();

            tab[i]=note;
        }

        System.out.println("La note 20 a été donnée :"+nbOccurrences(tab,20)+" fois");
        System.out.println("la moyenne du groupe est: "+ sommeValeurs(tab)/tab.length);
        System.out.println("La note zero a été donnée: "+estPrésent(tab,0));


    }

    static int indicePremOccurrence(int[] tab, int val){
        int indice=-1;
        for(int i = 0; i<tab.length;i++){
            if(tab[i] == val){
                indice=i;
                break;
            }
        }
        return indice;
    }

    static int indiceDernOccurrence(int[] tab, int val){
        int indice=-1;
        for(int i = 0; i< tab.length;i++){
            if(tab[i] == val){
                indice=i;
            }
        }
        return indice;
    }

    static int nbOccurrences (int[] tab, int min, int max){
        int nbOccurences = 0;

        if(min>max){
            System.out.println("WARNING!! min superieur a max");
            nbOccurences=-1;

        }else{
            for(int i=0;i< tab.length;i++){
                if(tab[i] >= min && tab[i] <= max){
                    nbOccurences++;
                }
            }
        }
        return nbOccurences;
    }

    static double plusGrandPositif (double[] tab){

        double plusGrand=-1;
        double temp;


        for(int i=0;i< tab.length;i++) {
            if (tab[i] >= 0) {
                temp=tab[i];
                if(plusGrand<=temp){
                    plusGrand=temp;
                }
            }
        }
        return plusGrand;
    }




}
