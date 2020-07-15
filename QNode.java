/* Ryan Whyte - 1800715
 * Chadwick Cox - 1800729
 * 
 * Lab Class - Friday @3pm
 *Data Structures Project
 * */


package linkedlist;

public class QNode {
	
		private guessqueue Data;
		public QNode nextNode;
		public QNode prevNode;

		public QNode() {
			
			Data = new guessqueue();
			nextNode= null;
			prevNode= null;
		}
		
		public QNode(char data) {/* Primary constructor*/
			this.Data=Data;
			nextNode= null;
			prevNode = null;
					
		
	}
		
		

		public QNode getNextNode() {
			return nextNode;
		}

		public void setNextNode(QNode nextNode) {
			this.nextNode = nextNode;
		}

		public QNode getPrevNode() {
			return prevNode;
		}

		public void setPrevNode(QNode prevNode) {
			this.prevNode = prevNode;
		}

		public void setData(guessqueue data) {/* set a data that has been given*/
			Data = data;
		}

		public guessqueue getData() {
			return Data;
		}

		
		
}
