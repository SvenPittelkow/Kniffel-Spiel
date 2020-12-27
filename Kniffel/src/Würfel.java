import java.util.Random;

public class Würfel {
	
	public int getZahl() {
	Random würfel = new Random();
	int Zahl = 0;

	for (int i=0; i<10; i++){
		Zahl = 1 + würfel.nextInt(6);
		}
	return Zahl;
	}
}
