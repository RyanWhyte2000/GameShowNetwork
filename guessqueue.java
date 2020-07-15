package linkedlist;

public class guessqueue {
	public char data; 
	
	public guessqueue(char data) {/* Primary constructor*/
		this.data=data;
		
}
	public guessqueue() {/* defaualt constructor*/
		data=' ';
		
}

	public char getData() {/*return the data*/
		return data;
	}

	public void setData(char data) {/* set a data that has been given*/
		this.data = data; 
	}



	

}
