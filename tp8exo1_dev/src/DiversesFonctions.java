public class DiversesFonctions {

    /*
     * Retourne la valeur absolue d'un int.
     */
    public static int valAbs(int x) {
        int valAbs;
        if (x < 0) {
            valAbs = -x;
        } else {
            valAbs = x;
        }
        return valAbs;
    }

    /*
     * Retourne la valeur absolue d'un int.
     */
    // Autre solution avec return dans les branches du if...else.
/*	public static int valAbs(int x) {
		if (x<0) {
			return -x;
		}
		else {
			return x;
		}
	}
*/

    /*
     * Retourne true si x est égal à zéro.
     */
    public static boolean estNul(int x) {
        return x == 0;
    }

    /*
     * Retourne un nombre aléatoire pair compris entre 0 et 100 inclus.
     */
    public static int aleatoirePairEntre0et100inclus() {
        return 2 * (int) (Math.random() * 51);
    }

    public static int signe(int a) {
        if (a < 0) {
            return -1;
        } else if (a > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean pair(int a) {
        return (a % 2 == 0);
    }

    public static int max(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max=a;
        } else if (b>a && b>c) {
            max=b;
        } else {
            max=c;
        }
        return max;
    }

    public static boolean auMoinsUnCaractère (String s){
        return s.length()>0;
    }

    public static boolean  nombreBinaire(String s) {
        boolean binaire = true;
        int i=0;

        while(i<s.length() && binaire!=false){
            binaire=(s.charAt(i)=='0' || s.charAt(i)=='1');
            i++;
        }
        return binaire;
    }

    public static int parseInt(String s){

        int stringToint;
        int i;
        double result=0;

        for(i=s.length();i>0;i--){
            stringToint=s.charAt(0)-'0';
            result=result+(stringToint*Math.pow(10,i));

        }

    }
    public static int valeur(String nombreEntierPositif){
        int b= parseInt(nombreEntierPositif);

        if(nombreEntierPositif.length()>9 || b<0){
            return -1;
        }
        else{
            return b;
        }

    }

    public static int valeur2(String nombreBinaireNonSigné){


        int IntBinaire= parseInt(nombreBinaireNonSigné);
        int Byte = Integer.bitCount(IntBinaire);
        System.out.println(Byte);

        int result;

        if(Byte>30 || !nombreBinaire(nombreBinaireNonSigné)){
            result=-1;
        }
        else{
            result = IntBinaire;
        }
        return result;

    }


}

