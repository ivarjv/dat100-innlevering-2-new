package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

        System.out.print("[");
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);
            if (i < tabell.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }



	// b)
	public static String tilStreng(int[] tabell) {
        String resultat = "[";

        for (int i = 0; i < tabell.length; i++) {
            resultat += tabell[i];
            if (i < tabell.length - 1) {
                resultat += ",";
            }
        }
        resultat += "]";
        return resultat;
	}

	// c)
	public static int summer(int[] tabell) {

        int sum = 0;

        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }

        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

        for (int i = 0; i < tabell.length; i++) {
            if(tabell[i] == tall) {
                return true;
            }
        }
        return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

        for(int i = 0; i < tabell.length; i++) {
            if(tabell[i] == tall) {
                return i;
            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

        int[] reversertTabell = new int[tabell.length];

        for(int i = 0; i < tabell.length; i++) {
            reversertTabell[i] = tabell[tabell.length - i - 1];
        }
        return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

        for (int i = 1; i < tabell.length; i++) {
            if(tabell[i-1] > tabell[i]) {
                return false;
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] sammenlagtTabell = new int[tabell1.length + tabell2.length];

        for(int i = 0; i < tabell1.length; i++) {
            sammenlagtTabell[i] = tabell1[i];
        }

        for(int i = 0; i < tabell2.length; i++) {
            sammenlagtTabell[tabell1.length + i] = tabell2[i];
        }
        return sammenlagtTabell;

	}
}
// Kloningen funket ikke i vår første repository, har kopiert over kodene fra den over hit