/**
 * Cette classe permet de faire fonctionner un jeu au tennis.
 * Responsabilités de la classe :
 * - créer un nouveau jeu
 * - enregistrer le fait que j1 ou j2 a marqué un point au jeu
 * - dire si le jeu est terminé
 * - dire qui a gagné
 * - retourner une version affichable du score
 * @author lukom
 *
 */
public class Jeu {
	private int nbPointA;
	private int nbPointB;
	
	public Jeu() {
		this.nbPointA = 0;
		this.nbPointB = 0;
	}
	
	/**
	 * Save the fact le joueur j1 mark a point
	 */
	public void wonA() {
		this.nbPointA++;
	}

	public void wonB() {
		this.nbPointB++;
	}

	/**
	 * Return true if a Jeu is finished.
	 * @return boolean
	 */
	public boolean isFinished() {
		return (nbPointA>=4 && nbPointA>nbPointB+1) || (nbPointB>=4 && nbPointB>nbPointA+1);
	}
	
	/**
	 * Return 1 if joueur 1 won, 2 if joueur 2 won else 0 if le jeu is not finished.
	 * @return int
	 */
	public int winner() {
		int result;
		if (nbPointA>=4 && nbPointA>nbPointB+1) {
			result = 1;
		}
		else if	(nbPointB>=4 && nbPointB>nbPointA+1) {
			result = 2;
		}
		else {
			result = 0;
		}
		return result;
	}
	
	/**
	 * Return the score under form 
	 * @return String
	 */
	public String scoreJeuAffichable (){
		if (nbPointA==0 && nbPointB==0) return "0-0";
		else if (nbPointA==0 && nbPointB==1) return "0-15";
		else if (nbPointA==0 && nbPointB==2) return "0-30";
		else if (nbPointA==0 && nbPointB==3) return "0-40";
		else if (nbPointA==1 && nbPointB==0) return "15-0";
		else if (nbPointA==1 && nbPointB==1) return "15-15";
		else if (nbPointA==1 && nbPointB==2) return "15-30";
		else if (nbPointA==1 && nbPointB==3) return "15-40";
		else if (nbPointA==2 && nbPointB==0) return "30-0";
		else if (nbPointA==2 && nbPointB==1) return "30-15";
		else if (nbPointA==2 && nbPointB==2) return "30-30";
		else if (nbPointA==2 && nbPointB==3) return "30-40";
		else if (nbPointA==3 && nbPointB==0) return "40-0";
		else if (nbPointA==3 && nbPointB==1) return "40-15";
		else if (nbPointA==3 && nbPointB==2) return "40-30";
		else if (nbPointA>=3 && nbPointA==nbPointB) return "égalité";
		else if(nbPointA>=4 && nbPointA==nbPointB+1) return "avantage joueur 1";
		else if(nbPointB>=4 && nbPointB==nbPointA+1) return "avantage joueur 2";
		else if(nbPointA>=4 && nbPointA>nbPointB+1) return "jeu joueur 1";
		else if(nbPointB>=4 && nbPointB>nbPointA+1) return "jeu joueur 2";
		else return "Il y a un problème dans mon programme (ce cas ne devrait jamais se produire)";
	}

}
