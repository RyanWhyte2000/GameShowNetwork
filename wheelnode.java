/* Ryan Whyte - 1800715
 * Chadwick Cox - 1800729
 * 
 * Lab Class - Friday @3pm
 *Data Structures Project
 * */

package linkedlist;

public class wheelnode {
	/* variable declaration*/
	private String type;
	private int value;
	private wheelnode nextNode;
	
	public wheelnode(String type, int value) {/* Primary constructor*/
		
		this.type= type;
		this.value= value;
	}

	public String getType() {/* return type of card*/
		return type;
	}

	public void setType(String type) {/* set type of card*/
		this.type = type;
	}

	public int getValue() {/* return value of card*/
		return value;
	}

	public void setValue(int value) {/* set value of card*/
		this.value = value;
	}

	public wheelnode getNextNode() {/*return the current wheelnode*/
		return nextNode;
	}

	public void setNextNode(wheelnode nextNode) {/*set the data in a node*/
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "wheelnode [type=" + type + ", value=" + value + "]";
	}

}
