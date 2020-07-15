/* Ryan Whyte - 1800715
 * Chadwick Cox - 1800729
 * 
 * Lab Class - Friday @3pm
 *Data Structures Project
 * */
package linkedlist;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class gsndriver {

	public static void main(String[] args) {
	
		Scanner Keyboard = new Scanner(System.in);
		
		
		Gsnlinkedlist gsn = new Gsnlinkedlist();
		
		gsn.implementwheel();
		gsn.writetofile();
		
		
		System.out.println("Welcome to WHEEL OF FORTUNE");

		
		for(int c=1; c<4; c++) {
			
		
			System.out.println("Enter the name of Player "+c);
			String name = Keyboard.next();
			int playernum= c;
			gsn.addplayernodeatfront(playernum, name, 0);
	
		}
		
 
		gsn.gameplay();
		gsn.startgame();
		
		 
	}
	
	
}
