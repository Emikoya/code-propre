package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", TypeCaisse.PETIT));
		caisses.add(new Caisse("Moyens objets", TypeCaisse.MOYEN));
		caisses.add(new Caisse("Grands objets", TypeCaisse.GRAND));
	}

	public void addItem(Item item) {

		//TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
		for(Caisse caisse : caisses){
			if (caisse.peutContenir(item)){
				caisses.add(caisse);
				break;
			}
		}
	}

	public int taille() {
		
		//TODO faites évoluer ce code.
		int nb = 0;
        for (Caisse caisse : caisses) {
            nb+= caisse.getItems().size();
        }
		return nb;
	}
}
