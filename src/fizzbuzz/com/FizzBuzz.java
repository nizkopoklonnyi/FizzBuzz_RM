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
		if(number %5==0)
            presentation.print(buzz );
		if(number %3!=0 && number%5!=0)
			presentation.print(((Integer)number).toString());
		
			
	}
	
}
