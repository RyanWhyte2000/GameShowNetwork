/* Ryan Whyte - 1800715
 * Chadwick Cox - 1800729
 * 
 * Lab Class - Friday @3pm
 *Data Structures Project
 * */
package linkedlist;

public class puzzlenode {
	private String category;
	private String puzzle;
	private puzzlenode nextNode;

	public puzzlenode getNextNode() {
		return nextNode;
	}

	public void setNextNode(puzzlenode nextNode) {
		this.nextNode = nextNode;
	}

	public puzzlenode(String category,String puzzle ) {
		
		this.category= category;
		this.puzzle= puzzle;
	}

	@Override
	public String toString() {
		return "puzzlenode [category=" + category + ", puzzle=" + puzzle + "]";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPuzzle() {
		return puzzle;
	}

	public void setPuzzle(String puzzle) {
		this.puzzle = puzzle;
	}

}
