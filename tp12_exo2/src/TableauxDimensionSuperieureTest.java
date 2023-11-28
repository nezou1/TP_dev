import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



    /*
     * Ce corrigé n'est pas complet, seuls quelques cas particulièrement intéressants ont été traités.
     */

    public class TableauxDimensionSuperieureTest {

        // NB de valeurs vraies dim 2

        @Test
        public final void testnbTrueDimension2() {

            boolean[][] tabLongsZero = new boolean[0][0];
            assertEquals (0, TableauxDimensionSuperieure.nbTrueDim2(tabLongsZero), "cas longueurs zéro");

            boolean[][] tabAvecTrueEnBornes = {{true, false, true},{true, false, true}};
            assertEquals (4, TableauxDimensionSuperieure.nbTrueDim2(tabAvecTrueEnBornes), "cas longs>0 et true aux bornes");

            boolean[][] tabAvecTrueHorsBornes = {{false, true, false},{false, true, false}};
            assertEquals (2, TableauxDimensionSuperieure.nbTrueDim2(tabAvecTrueHorsBornes), "cas longs>0 et true hors bornes");
        }

// NB de valeurs vraies dim 4

        @Test
        public final void testnbTrueDimension4() {

            boolean[][][][] tabLongsZero = new boolean[0][0][0][0];
            assertEquals (0, TableauxDimensionSuperieure.nbTrueDim4(tabLongsZero), "cas longueurs zéro");

            boolean[][][][] tabAvecTrueEnBornes = {{{{true, false, true},{true, false, true}},
                    {{true, false, true},{true, false, true}}},
                    {{{true, false, true},{true, false, true}},
                            {{true, false, true},{true, false, true}}}};
            assertEquals (16, TableauxDimensionSuperieure.nbTrueDim4(tabAvecTrueEnBornes), "cas longs>0 et true aux bornes");

            boolean[][][][] tabAvecTrueHorsBornes = {{{{false, true, false},{false, true, false}},
                    {{false, true, false},{false, true, false}}},
                    {{{false, true, false},{false, true, false}},
                            {{false, true, false},{false, true, false}}}};
            assertEquals (8, TableauxDimensionSuperieure.nbTrueDim4(tabAvecTrueHorsBornes), "cas longs>0 et true hors bornes");
        }


// est présent dim 2

        @Test
        public final void testEstPresentDimension2() {
            // Cette méthode de test est très incomplète.
            // Un vrai jeu de tests nécessiterait de prendre en compte beaucoup d'autres cas.

            int[][] tabLongsZero = new int[0][0];
            assertFalse (TableauxDimensionSuperieure.estPresentDim2(tabLongsZero,12), "cas longueurs zéro");

            int[][] tab1 = {{12, 0, 5},{13, 8, 9}};
            assertTrue (TableauxDimensionSuperieure.estPresentDim2(tab1, 12), "cas true 1");

            int[][] tab2 = {{7, 0, 5},{13, 8, 12}};
            assertTrue (TableauxDimensionSuperieure.estPresentDim2(tab2, 12), "cas true 2");

            int[][] tabPasPrésent = {{7, 0, 5},{13, 8, 55}};
            assertFalse (TableauxDimensionSuperieure.estPresentDim2(tabPasPrésent, 12),"cas pas présent");
        }

//estPresent dim 4
        @Test
        public final void estPresentDimension4() {

            int[][][][] tabLongsZero = new int[0][0][0][0];
            assertFalse(TableauxDimensionSuperieure.estPresentDim4(tabLongsZero,4));
            int[][][][] tabvrai= {{{{4, 1, 4},{4, 1, 4}},
                    {{4, 1, 4},{4, 1, 4}}},
                    {{{4, 1, 4},{4, 1, 4}},
                            {{4, 2, 4},{4, 1, 4}}}};
            assertTrue(TableauxDimensionSuperieure.estPresentDim4(tabvrai,2));
            int[][][][] tabfaux= {{{{4, 1, 4},{4, 1, 4}},
                    {{4, 1, 4},{4, 1, 4}}},
                    {{{4, 1, 4},{4, 1, 4}},
                            {{4, 2, 4},{4, 1, 4}}}};
            assertFalse(TableauxDimensionSuperieure.estPresentDim4(tabfaux,7));

        }

// mettre négatifs à zéro dim 2

        @Test
        public final void testMettreLesNégatifsAZéroDimension2() {

            int[][] longZéro = new int[0][0];
            TableauxDimensionSuperieure.mettreLesNégatifsàZéroDim2(longZéro);
            assertArrayEquals(new int[0][0],longZéro, "cas Longueur zéro");

            int[][] observéNégatifsAuxExtrémités = {{-6, 5, -7, -1}, {-2, 0, 8, -2}, {-1, 7, 2, -12}};
            TableauxDimensionSuperieure.mettreLesNégatifsàZéroDim2(observéNégatifsAuxExtrémités);
            int[][] attenduCasAvecNégatifsAuxExtrémités = {{0,5,0,0},{0,0,8,0},{0,7,2,0}};
            assertArrayEquals(attenduCasAvecNégatifsAuxExtrémités, observéNégatifsAuxExtrémités, "cas négatifs aux extrémités du tableau");

        }


// sommes des lignes


        @Test
        public final void testSommesLignesDimension2() {

            int[][] longZéro = new int[0][0];
            assertArrayEquals(new int[0],TableauxDimensionSuperieure.sommesLignes(longZéro), "cas Longueur zéro");

            int[][] entrée = {{-6, 5, 6, 1}, {-2, 0, 8, -2}, {-1, 7, 2, -12}};
            int[] attendu = { 6, 4, -4};
            assertArrayEquals(attendu, TableauxDimensionSuperieure.sommesLignes(entrée), "cas moyen");

        }

/**/
    }

