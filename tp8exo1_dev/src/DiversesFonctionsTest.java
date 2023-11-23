import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiversesFonctionsTest {

    @Test
    void valAbs() {

        assertEquals(4, DiversesFonctions.valAbs(4), "cas positif");

        assertEquals(4, DiversesFonctions.valAbs(-4), "cas négatif");

        assertEquals(0, DiversesFonctions.valAbs(0), "cas nul");
    }

    @Test
    void estNul() {
        assertTrue(DiversesFonctions.estNul(0), "cas nul");

        assertFalse(DiversesFonctions.estNul(-6), "cas négatif");

        assertFalse(DiversesFonctions.estNul(3), "cas positif");
    }

    @Test
    void aleatoirePairEntre0et100inclus() {
        int alea;

        /*  Remarquons que ce test est loin d'être complet :
         *  Il vérifie que des valeurs hors domaine ne sont pas générées,
         *  mais ne vérifie pas que toutes les valeurs de l'interval [0,100] sont atteintes
         *  et encore moins que la probabilité est uniforme.
         */
        for (int i=1 ; i <= 150 ; i++){
            alea = DiversesFonctions.aleatoirePairEntre0et100inclus();
            assertTrue(alea >= 0 && alea <= 100 && alea%2 == 0);
        }
    }

    @Test
    void signe(){
        assertEquals(-1,DiversesFonctions.signe(-4),"cas negatif");
        assertEquals(1,DiversesFonctions.signe(10),"cas positif");
        assertEquals(0,DiversesFonctions.signe(0),"cas nul");
    }

    @Test
    void pair(){
        assertTrue(DiversesFonctions.pair(2));
        assertFalse(DiversesFonctions.pair(-3));
        assertTrue(DiversesFonctions.pair(0));

    }

    @Test
    void max(){
        assertEquals(3,DiversesFonctions.max(1,2,3));
        assertEquals(5,DiversesFonctions.max(5,4,3));
        assertEquals(0,DiversesFonctions.max(-1,0,-2));
    }

    @Test
    void auMoinsUnCaractère(){
        assertTrue(DiversesFonctions.auMoinsUnCaractère("bonjour"));
        assertTrue(DiversesFonctions.auMoinsUnCaractère(" "));
        assertFalse(DiversesFonctions.auMoinsUnCaractère(""));

    }

    @Test
    void nombreBinaire(){
        assertTrue(DiversesFonctions.nombreBinaire("1010"));
        assertFalse(DiversesFonctions.nombreBinaire("10a1"));
        assertFalse(DiversesFonctions.nombreBinaire("1021"));
    }

    @Test
    void valeur(){
        assertEquals(123456789,DiversesFonctions.valeur("123456789"));
        assertEquals(-1,DiversesFonctions.valeur("-123456789"));
        assertEquals(-1,DiversesFonctions.valeur("1234567898"));
        assertEquals(11,DiversesFonctions.valeur("11"));
    }
    @Test

    void valeur2(){
        assertEquals(-1,DiversesFonctions.valeur2("123"));
        assertEquals(1010,DiversesFonctions.valeur2("1010"));

    }
}
