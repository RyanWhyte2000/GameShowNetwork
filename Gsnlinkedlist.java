/* Ryan Whyte - 1800715
 * Chadwick Cox - 1800729
 * 
 * Lab Class - Friday @3pm
 *Data Structures Project
 * */


package linkedlist;
/* java built in functions*/
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.Random;


	

public class Gsnlinkedlist {
	
	
	private Playernode PlayerHead;
	private Playernode PlayerTail;
	private wheelnode wheelhead;
	private wheelnode wheeltail;
	
	private puzzlenode puzzleHead;
	private puzzlenode puzzleTail;
	
	
	Scanner input = new Scanner(System.in);

	public int size =0;
	
	
	
	public void addplayernodeatfront(int number, String name,  int total) {/* This block of code adds player to a circular list*/
		
		Playernode n = new Playernode(number, name, total);//1st create a new player node that we want to insert
		
		if (PlayerHead==null) {//check for empvty list;	
			PlayerHead=n;
			PlayerTail=n;
			n.setNextNode(PlayerHead);
		}else {
			
			
			PlayerTail.setNextNode(n); 
			PlayerTail= n;
			n.setNextNode(PlayerHead);
		}
		
	}
public void addpuzzledata(String cat, String puzzle) {/* This block of code adds player to a circular list*/
		
	puzzlenode n = new puzzlenode(cat, puzzle);//1st create a new player node that we want to insert
		
		if (puzzleHead==null) {//check for empvty list;
			
			puzzleHead=n;
			puzzleTail=n;
			n.setNextNode(puzzleHead);
		}else {
			
			
			puzzleTail.setNextNode(n);
			puzzleTail= n;
			n.setNextNode(puzzleHead);
		}
		
	}
	
	public void addwheelnodeatfront( String type, int value) {/* This block of code add the wheel type and value  to a circular list*/
		wheelnode newwheel = new wheelnode(type, value); //1st create a new wheel node that we want to insert
		if(this.wheelhead== null) {//check for empvty list;
			
			this.wheelhead= newwheel;
			this.wheeltail= newwheel;
			newwheel.setNextNode(wheelhead); 
			
		}else {
			wheeltail.setNextNode(newwheel);
			wheeltail = newwheel;
			newwheel.setNextNode(wheelhead);
		
		}
	}
	
	public void implementwheel() {/*This method adds the value of a wheel to a wheel linklist*/
		
		
		addwheelnodeatfront("moneycard", 600);
		addwheelnodeatfront("moneycard", 550);
		addwheelnodeatfront("moneycard", 500);
		addwheelnodeatfront("moneycard", 600);
		addwheelnodeatfront("bankrupt", 0);
		addwheelnodeatfront("moneycard", 650);
		addwheelnodeatfront("moneycard", 800);
		addwheelnodeatfront("moneycard", 700);
		addwheelnodeatfront("moneycard", 0);
		addwheelnodeatfront("moneycard", 800);
		addwheelnodeatfront("moneycard", 500);
		addwheelnodeatfront("moneycard", 650);
		addwheelnodeatfront("moneycard", 500);
		addwheelnodeatfront("moneycard", 900);
		addwheelnodeatfront("bankrupt", 0);
		addwheelnodeatfront("moneycard", 2500);
		addwheelnodeatfront("loseturn", 0);
		addwheelnodeatfront("moneycard", 600);
		addwheelnodeatfront("moneycard", 700);
		addwheelnodeatfront("moneycard", 600);
		addwheelnodeatfront("moneycard", 650);
		addwheelnodeatfront("moneycard", 500);
		addwheelnodeatfront("moneycard", 700);
		addwheelnodeatfront("bankrupt", 0);
	}
	
	
	public void writetofile() {/* This method writes puzzle and category to file*/
		
		try { 
			Scanner in = new Scanner(System.in);
			File file = new File("WheelData.txt"); /*FILE DECLARATION*/
			
			
			
			Random rand = new Random(); /*GENRATE RANDOM NUMBER*/
			file.createNewFile();
			if (file.exists()) {/*CHECK IF FILE EXISTS ON MACHINE*/

				FileWriter writer = new FileWriter(file, true);
				
				/* WRITES DATA TO FILE*/
				writer.write( "Thing"+ "Phone" +"\n");
				writer.write( "Place" +"Mississippi" +"\n");
				writer.write( "Person" +"MagicJohnson"+"\n");
				writer.write( "Phrase" +"Cutit");

				writer.close();

			} else {

				System.out.println("File not Found");
				in.close();
			} 
		} catch (IOException e) {

			System.out.println("File Error");
			e.printStackTrace();
		}

		
	}
public void gameplay() {/*This method takes the values from the puzzle file and ands them to a linklist*/
	try {
		if (new File("WheelData.txt").exists()) {
			 
			Scanner read;
			
				read = new Scanner(new File("WheelData.txt"));
	
			while (read.hasNext()) {
				String category= read.next(); 
				String secretPhrase = read.next(); 
				addpuzzledata(category, secretPhrase );

			} 
			read.close();
					 
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	}

public void startgame() {/* This method is the game play*/
	
	Queue q = new Queue();

	
	Playernode currentplayer = this.PlayerHead;
	puzzlenode currentpuzzle= this.puzzleHead;
	
	/*Variable declaration and Node initialize*/
	
	
	boolean notDone = true;
	int puzzlecomplete=0;
	String guesses= " "; 
	String letter;
	
	do {
	/*This block of code prints player's information*/
	System.out.println("PLayer name is "+currentplayer.getPlayername());
	System.out.println("PLayer number is "+currentplayer.getPlayernumber());
	System.out.println("PLayer Total is  "+currentplayer.getPlayergrandtotal());

	wheelnode position= spinwheel();// spins the wheel then takes value and type from wheel
	
	String temptype= position.getType(); // gets type of card
	int tempvalue= position.getValue(); // gets value of card
	
	String secretPhrase= currentpuzzle.getPuzzle(); //gets puzzle phrase from the puzzle list
	String category= currentpuzzle.getCategory(); //gets puzzle category from the puzzle list
	
	
	System.out.println("CATEGORY IS:"+category);

	if(temptype== "bankrupt") {
		
		currentplayer.setRoundtotal(tempvalue);//assign zero to the cuurent pla round
		System.out.println("TURN LOST; MOVING TO NEXT PLAYER");
		currentplayer= currentplayer.getNextNode();// change player turn
		
		/*This block of code prints player's information*/
		System.out.println("PLayer name is "+currentplayer.getPlayername());
		System.out.println("PLayer number is "+currentplayer.getPlayernumber());
		System.out.println("PLayer Total is  "+currentplayer.getPlayergrandtotal());
	}else
		if( temptype== "loseturn"){
			System.out.println("TURN LOST; MOVING TO NEXT PLAYER");

		currentplayer= currentplayer.getNextNode();// change player turn
		/*This block of code prints player's information*/
		System.out.println("PLayer name is "+currentplayer.getPlayername());
		System.out.println("PLayer number is "+currentplayer.getPlayernumber());
		System.out.println("PLayer Total is  "+currentplayer.getPlayergrandtotal());
		
	}
 
	
	else {
			
			
			while(true) {
				notDone = false;
			
			
			/////solving puzzle
			for(char secretLetter: secretPhrase.toCharArray()) //goes through each word letter by letter
				
			{
			
			if (guesses.indexOf(secretLetter)== -1 ) //checks the letter being guess 
			{

				System.out.print('*');
				
				notDone= true; 
				
			}else { 
				
				System.out.print(secretLetter);
				/*System.out.println("Do you want to :");
				System.out.println("1. Buy vowel :");*/
			}
			
			

		}//end of for loop
			 
			
			if(!notDone)
			{
				puzzlecomplete=1;
				break;
			}
			System.out.print("\n\n Enter a Letter: ");	
			if(currentplayer.getRoundtotal()>0) {
			System.out.print(" 'or solve the Puzzle': ");
			}
			letter= input.next();
			
			guesses +=letter;
			//q.Enqueue(guesses);
			
			for(char secretLetter: secretPhrase.toCharArray()) //goes through each word letter by letter
			{
			
				if (guesses.indexOf(secretLetter)== -1 ) //checks the letter being guess 
				{		
					System.out.println("INCORRECT GUESS; MOVING TO NEXT PLAYER");
					currentplayer= currentplayer.getNextNode();// change player turn
					
					/*This block of code prints player's information*/
					System.out.println("PLayer name is "+currentplayer.getPlayername());
					System.out.println("PLayer number is "+currentplayer.getPlayernumber());
					System.out.println("PLayer Total is  "+currentplayer.getPlayergrandtotal());
					break;
					
				}
			}
	
			//store guessed letters
		}
			//if(puzzlecomplete ==1) {
				System.out.print(" Puzzle completed by : "+currentplayer.getPlayername());
				
				currentpuzzle= currentpuzzle.getNextNode();
				currentplayer= currentplayer.getNextNode();
				
			//}
		}
	}while(puzzlecomplete ==1);

}

public wheelnode spinwheel() {// This method is responsible for 'spinning the wheel' and 1
	wheelnode currentposition = this. wheelhead;

	String temptype;
	int count=0;
	int position = (int) (Math.random() * (100 - 50)) + 50;//generates a random position betw
	int tempvalue;

	if(this. wheelhead==null) {
		System.out.println("\nThe list is empty"); 
		return null;
	}
	else {
		
		do{
				count = count +1;	
	
				if (count == position) {		 
					temptype= currentposition.getType(); 
					 tempvalue= currentposition.getValue();
					
					System.out.println("\n You have landed on :"+temptype+" value:"+tempvalue);
											
				}else {
					currentposition= currentposition.getNextNode();
				}
			}	while(count<position);
		
		
	}
	return currentposition;
	
}


}
	
	