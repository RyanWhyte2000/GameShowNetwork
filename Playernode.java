/* Ryan Whyte - 1800715
 * Chadwick Cox - 1800729
 * 
 * Lab Class - Friday @3pm
 *Data Structures Project
 * */
package linkedlist;
public class Playernode {
	/* Variable declaration*/
	private int playernumber;
	private String playername;
	private int roundtotal=0;
	private int playergrandtotal=0;
	private Playernode nextNode;
	
	public int getRoundtotal() {/* return the value of a round total*/
		return roundtotal;
	}

	public void setRoundtotal(int roundtotal) {/* Set the value of a round total*/
		this.roundtotal = roundtotal;
	}

	
	
	@Override
	public String toString() {
		return "Playernode [playernumber=" + playernumber + ", playername=" + playername + ", playergrandtotal="
				+ playergrandtotal + "]";
	}

	public int getPlayernumber() {/* return a player's round total*/
		return playernumber; 
	}

	public void setPlayernumber(int playernumber) {/* set a player's round total*/
		this.playernumber = playernumber;
	}

	public String getPlayername() {/* return a player's name*/
		return playername;
	}

	public void setPlayername(String playername) {/* set a player's name */
		this.playername = playername;
	}

	public int getPlayergrandtotal() { /* return a player's grand total*/
		return playergrandtotal;
	}

	public void setPlayergrandtotal(int playergrandtotal) {/* set a player's grand total*/
		this.playergrandtotal = playergrandtotal;
	}

	public Playernode getNextNode() {/* return a player's node*/
		return nextNode;
	}

	public void setNextNode(Playernode nextNode) {/* Set a player's node*/
		this.nextNode = nextNode;
	}

	public Playernode(int number, String name, int total) {/* Primary Constructor*/
	this.playernumber=	number ;
	this.playername= name;
	this.playergrandtotal= total;
		
	}

}
