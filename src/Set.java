import java.util.ArrayList;

/**
 * Cette classe permet de faire fonctionner un Set dans un jeu de tennis.
 * Responsabilités de la classe :
 * - créer un Set
 * - enregistrer le fait que j1 ou j2 a marqué un point
 * - dire quand un Set est terminé
 * - afficher une version affichable du score
 * @author lukom
 *
 */
public class Set {
	private Jeu j;
	private ArrayList<Jeu> jj1;
	private ArrayList<Jeu> jj2;

	public Set() {
		this.j = new Jeu();
		this.jj1 = new ArrayList<>();
		this.jj2 = new ArrayList<>();
	}

	/**
	 * Save the fact le joueur 1 or le joueur j2 won a point.
	 */
	public void wonA() {
		if (!j.isFinished()) {
			j.wonA();
			System.out.println(j.scoreJeuAffichable());
		}
		if (j.isFinished()) {
			jj1.add(j);
			System.out.println("Le joueur 1 a gagné le Jeu");
			j = new Jeu();
		}

	}

	public void wonB() {
		if (!j.isFinished()) {
			j.wonB();
			System.out.println(j.scoreJeuAffichable());
		}
		if (j.isFinished()) {
			jj2.add(j);
			System.out.println("Le joueur 2 a gagné le Jeu");
			j = new Jeu();
		}
	}

	public boolean isFinished() {
		return (this.jj1.size() > 5 || this.jj2.size() > 5) && ((this.jj1.size() - this.jj2.size() >= 2) || (this.jj2.size() - this.jj1.size() >= 2));
	}


	/**
	 * Return the score under form displayable
	 * @return String
	 */
	public String scoreJeuAffichable (){
		if (this.jj1.size() == 6) return "Le joueur 1 a gagné un premier Set";
		else if (this.jj2.size() ==6) return "Le joueur 2 a gagné un premier Set";
		if (this.jj1.size() == 12) return "Le joueur 1 a gagné un deuxième Set";
		else if (this.jj2.size() == 12) return "Le joueur 2 a gagné le deuxième Set";
		else {
			return "";
		}
	}

}
