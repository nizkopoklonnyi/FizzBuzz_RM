package output.com;

import java.io.FileWriter;
import java.io.IOException;

/** Class-adapter for output the fizzbuzz result */
public class Presentation {

	/**print the fizzbuzz result	*/
	public void print(String result){
		printToConsole(result);
	}
	/** implemented*/
	private void printToConsole(String result){
		System.out.print(result+"\t");
	}
	/** don't implemented*/
	private void printToFile(String result) throws IOException{
		//...
	}
	/** don't implemented*/
	private void printToWebPage(){
		//...
	}
}
