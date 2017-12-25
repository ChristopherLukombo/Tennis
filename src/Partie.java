import java.util.Scanner;

public class Partie {
	private final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Match m = new Match();

		while (!m.isFinished()) {

			System.out.println("Entrez un caractère");
			char saisi = Character.toUpperCase(sc.next().charAt(0));
			
			switch(saisi) {
			case 'A':
				m.wonA();
				break;
			case 'B':
				m.wonB();
				break;
			}
			
		}

		sc.close();
	}

}
