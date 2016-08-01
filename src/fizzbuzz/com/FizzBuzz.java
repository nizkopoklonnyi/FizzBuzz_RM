package fizzbuzz.com;
import output.com.Presentation;

/**
 *Class check division by 3.(Fizz)  
*/
public class FizzBuzz {
	
	private Presentation presentation;
	private String fizz="Fizz", buzz="Buzz";

	public FizzBuzz(){
		presentation= new Presentation();
	} 
	
	public void check(int number){
		if(number%3==0)
			presentation.print(fizz);
		else
			presentation.print(((Integer)number).toString());
		
			
	}
	
}
