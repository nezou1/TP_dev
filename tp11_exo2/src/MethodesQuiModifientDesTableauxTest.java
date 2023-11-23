import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MethodesQuiModifientDesTableauxTest {
    // RAZ

    @Test
    public final void raz() {

        int[] tabLong0 = new int[0];
        MethodesQuiModifientDesTableaux.raz(tabLong0);
        assertArrayEquals(new int[0], tabLong0, "cas longueur zéro");

        int[] tabMoyen = {-6, 7, 444, -777, 0, 12};
        int[] tabMoyenResultat = {0, 0, 0, 0, 0, 0};
        MethodesQuiModifientDesTableaux.raz(tabMoyen);
        assertArrayEquals(tabMoyenResultat, tabMoyen, "cas longueur > 0");
    }


// VALEUR ABSOLUE

    @Test
    public final void valAbs() {

        int[] tabLong0 = new int[0];
        MethodesQuiModifientDesTableaux.valAbs(tabLong0);
        assertArrayEquals(new int[0], tabLong0, "cas longueur zéro");

        int[] tabMoyenNégatifsAuxBornes = {-6, 7, 444, -777, 0, -12};
        int[] tabMoyenResultatNégatifsAuxBornes = {6, 7, 444, 777, 0, 12};
        MethodesQuiModifientDesTableaux.valAbs(tabMoyenNégatifsAuxBornes);
        assertArrayEquals(tabMoyenResultatNégatifsAuxBornes, tabMoyenNégatifsAuxBornes, "cas longueur > 0, négatifs aux bornes");

        int[] tabMoyenPositifsAuxBornes = {6, 7, -444, 777, 0, 12};
        int[] tabMoyenResultatPositifsAuxBornes = {6, 7, 444, 777, 0, 12};
        MethodesQuiModifientDesTableaux.valAbs(tabMoyenPositifsAuxBornes);
        assertArrayEquals(tabMoyenResultatPositifsAuxBornes, tabMoyenPositifsAuxBornes, "cas longueur > 0, négatifs aux bornes");


    }

    // REMPLIR UN TABLEAU AVEC DES VALEURS ALEATOIRES
    @Test
    public final void remplirTableauAvecValeursAléatoires() {

        int[] t = new int[100];
        MethodesQuiModifientDesTableaux.remplirTableauAvecValeursAléatoires(t, 2, 4);

        vérifierValeursEntre2et4(t);
    }

    @Test
    public final void créerEtRemplirTableauAvecValeursAléatoires() {

        int[] t = MethodesQuiModifientDesTableaux.créerEtRemplirTableauAvecValeursAléatoires(100, 2, 4);

        vérifierValeursEntre2et4(t);
    }

    private void vérifierValeursEntre2et4(int[] t) {
        // on vérifie que les valeurs 1, 2 et 3 sont bien présentes dasn le tableau
        boolean trouvé2 = false, trouvé3 = false, trouvé4 = false;
        for (int val : t) {
            if (val==2) trouvé2 = true;
            if (val==3) trouvé3 = true;
            if (val==4) trouvé4 = true;
        }
        assertTrue(trouvé2, "valMin pas présente");
        assertTrue(trouvé3, "valeur moyenne pas présente");
        assertTrue(trouvé4, "valMax pas présente");

        // on vérifie qu'il n'y a pas d'autre valeur que 1, 2 et 3
        for (int val : t)
            assertTrue((val >= 2 && val <= 4), "valeur hors bornes");
    }

}

