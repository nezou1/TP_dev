public class CelsiusAndFarenheit {

    public static void afficherFenC(double farenheit){
        double celsius = (farenheit-32)*5/9;
        System.out.println(farenheit+" farenheit correspond a "+celsius+" celsius");
    }

    public static void afficherFenCApprox(int farenheit){
        double celsius = Math.round((farenheit-32)*5/9);
        System.out.println(farenheit+" farenheit correspond approximativement a "+celsius+" celsius");

    }

    public static double convertirFenC(double farenheit){
        double celsius =  (farenheit-32)*5/9;

        return celsius;
    }

    public static boolean çaGèleEnF(double farenheit){
        return (farenheit<=32);
    }

    public static String çaGlisseEnF(double farenheit){
        if(çaGèleEnF(farenheit)){
            return "Attention ! ça glisse !";
        }
        else{
            return "Pas de danger !";
        }
    }

    public static boolean çaBoutEnF(double farenheit){
        return farenheit>=212;
    }

    public static boolean eauLiquideEnF(double farenheit){
        return (!(çaGèleEnF(farenheit )&& çaGèleEnF(farenheit)));
    }

}
