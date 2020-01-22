import java.util.Scanner;

/*
 * 
 * @David Breitenbeck
 * 
 */

public class Lab3  {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entry; 
		String answer;
		String name;
		boolean looper = true;
		boolean loop2 = true;
		
		System.out.println("What is your name?");
		
		name = scanner.nextLine();
		
	
	do {	
		loop2 = true;
		System.out.println("Enter a number between 0 and 100, " + name);
		entry = scanner.nextInt();
		
		if (entry <= 100 && entry >=0) {
		if (entry % 2 != 0) {
			if (entry < 60) {
			System.out.print(entry + "   ");
			System.out.println("Odd");
			looper = false; 
			} else {
				System.out.print(entry + "   "); 
				System.out.println("Odd and over 60");
				looper = false; 
			}
		} else if (entry < 25) {
			System.out.println("Even and less than 25");
			looper = false; 
		} else if (entry > 25 && entry < 61) {
			System.out.println("Even");
			looper = false; 
		} else if (entry >= 61) {
			System.out.print(entry + "   "); 
			System.out.println("Even");
			looper = false; 
		}
		} else {
			System.out.println(name + ", I told you to enter a number between 0 and 100");
		}
	
		do {
			
		System.out.println("Do you want to go again, " + name + "? (Y/N)");
		
		scanner.nextLine();
		answer = scanner.nextLine().toLowerCase();
		
		if (answer.startsWith("y")) {
			looper = true;
			loop2 = false;
		} else if (answer.startsWith("n")) {
			System.out.println("Godspeed, " + name);
			looper = false;
			loop2 = false;
		} else {
			System.out.println("what?");
		}
		} while (loop2);
		
	} while (looper);
		
		scanner.close();
	
	}
}

