import java.util.*;

public class Main {

	public static void main(String[] args) {
		int eingabe = 20;
		
		if(eingabe % 5 == 0) {
			output(eingabe);
		}
		else {
			System.out.println("Ungültige Eingabe!");
		}

	}

	public static void output(int input) {
		Boolean result = false;
		int[] cash = {5,10,20,50,100,200,500};
		List<Integer> trys = new ArrayList<>();
		List<Integer> cashOutput = new ArrayList<>();
		
		if(input == 5 || input == 10 || input == 20 || input == 50 || input == 100 || input == 200 || input == 500) {
			System.out.println("Der Betrag " + input + "€ kann in einem Schein ausgegeben werden.");
		}
		
		for(int e: cash) {
			if(e < input) {
				cashOutput.add(e);
			}
		}
		
		while(!result) {
			int count = 0;
			for(int i = 0; i < cashOutput.size(); i++) {
				if(input % cashOutput.get(i) == 0) {
					
				}
			}
		}
	}
}
