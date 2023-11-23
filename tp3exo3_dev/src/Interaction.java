import java.util.Scanner;

public class Interaction {

    public static void menu(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String s;
        int choix;

        do {
            System.out.println("MENU:");
            System.out.println("1. Verifier si mon mot est un palindrome");
            System.out.println("2. Verifier si mon expression est bien parenthésée");
            System.out.println("3. Verifier si mon expression arithmétique est bien formée");

            System.out.println("4. Quitter");

            System.out.println("Entrez votre mot ou expression");
            s= sc.nextLine();

            System.out.print("choix: ");
            choix = sc.nextInt();



            if(choix>4 || choix<1){
                System.out.println("ERREUR: Choix inexistant ");
                return;
            }

            switch (choix) {

                case 1:
                    System.out.println(Verification.palindrome(s));
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Au revoir");
                    return;


            }
        }while(choix>0 && choix <5);

    }
}
