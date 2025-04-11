package ex5;

import static java.lang.Integer.MAX_VALUE;

public enum TypeCaisse {

    PETIT("Petits objets", 0, 5),
    MOYEN("Moyens objets", 5, 20),
    GRAND("Grands objets", 20, MAX_VALUE);

    private String libelle;
    private int min;
    private int max;

    TypeCaisse(String libelle, int min, int max) {
        this.libelle = libelle;
        this.min = min;
        this.max = max;
    }

    public boolean peutContenir(Item i){
        return min >= i.getPoids() && max <= i.getPoids();
    }
}
