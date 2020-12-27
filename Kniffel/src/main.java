import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		GUI gui = new GUI();
		Scanner sc = new Scanner(System.in);
		int eins = sc.nextInt();
		if (eins == 1) {
			gui.Regeln();
			System.out.println("Test");
		}
	}

}

