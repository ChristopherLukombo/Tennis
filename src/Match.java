import java.util.ArrayList;

/**
 * Cette classe permet de faire fonctionner un Match dans un jeu de Tennis.
 * Responsabilités de la classe :
 * - créer un Match
 * - enregistrer le fait que j1 ou j2 a marqué un point
 * - dire quand le Match est terminé
 * - afficher une version affichable du score
 * @author lukom
 *
 */
public class Match {
	private Set set;
	private ArrayList<Set> sst1;
	private ArrayList<Set> sst2;
	
	public Match() {
		this.set = new Set();
		this.sst1 = new ArrayList<>();
		this.sst2 = new ArrayList<>();
	}
	
	/**
	 * Save the fact le joueur 1 or le joueur j2 won a point.
	 */
	public void wonA() {
		if (!set.isFinished()) {
			set.wonA();
		}
		if (set.isFinished()) {
			System.out.println("Le joueur 1 a gagné le Set");
			sst1.add(set);

			set = new Set();

			if(this.isFinished()) {
				System.out.println(scoreJeuAffichable());
			}
		}
	}

	public void wonB() {
		if (!set.isFinished()) {
			set.wonB();
		}
		if (set.isFinished()) {
			System.out.println("Le joueur 2 a gagné le Set avec " + sst2.size()  +" Set(s)");
			sst2.add(set);

			set = new Set();

			if(this.isFinished()) {
				System.out.println(scoreJeuAffichable());
			}
		}
	}

	public boolean isFinished() {
		return sst1.size() == 2 ||  sst2.size() == 2;
	}

	/**
	 * Return the score under form displayable
	 * @return String
	 */
	public String scoreJeuAffichable (){
		if (sst1.size() == 2) return "Le joueur 1 a gagné le Match";
		else if (sst2.size() == 2) return "Le joueur 2 a gagné le Match";
		else return "Il y a un problème dans mon programme (ce cas ne devrait jamais se produire)";
	}

}
