/* Ryan Whyte - 1800715
 * Chadwick Cox - 1800729
 * 
 * Lab Class - Friday @3pm
 *Data Structures Project
 * */


package linkedlist;


public class Queue{
	private QNode Front;  
	private QNode Rear; 
	
public Queue()  { 
	Front = null;   
	Rear = null; 
	}

public QNode getFront() {
	return Front;
}

public void setFront(QNode front) {
	Front = front;
}

public QNode getRear() {
	return Rear;
}

public void setRear(QNode rear) {
	Rear = rear;
} 

public void Enqueue(char data)  {  
	QNode temp = new QNode(data);   
	if (temp != null)  {    
		if(Front ==null)    {    
			Front=temp;     
			Rear=temp;    }    
		else    {  
			Rear.setNextNode(temp);
			temp.setNextNode(Rear);
		Rear = temp;   
		} 
		} else {  
			System.out.println("The list is full. Cannot add another node.");
			} 

}

public guessqueue Dequeue()  
{ 
	guessqueue  dataToReturn = null;  
	if(Front != null)   
	{    
		if(Front == Rear)    
		{   
			Rear = null; 
			} 
		QNode temp = Front;    
		dataToReturn = Front.getData();   
		Front = Front.getNextNode();   
		temp = null;         
		}  
	return dataToReturn;  
	}   
/*public int CountNodes()  {  
	int count = 0; 
	QNode tempQueue = new QNode(); 

while(Front != null)  
{                  
	tempQueue.Enqueue(Dequeue());         
	count++;              } 

while(tempQueue.getFront()!= null)       
{                  
	Enqueue(tempQueue.Dequeue());         
	}             
return count; } 

*/
}
