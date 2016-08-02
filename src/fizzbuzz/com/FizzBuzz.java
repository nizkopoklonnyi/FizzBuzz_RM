package fizzbuzz.com;
import output.com.Presentation;

/**
 *Class check division by 3.(Fizz)  
*/
public class FizzBuzz {
	
	private Presentation presentation;
	private String fizz="Fizz", buzz="Buzz",fizzbuzz="fizzbuzz";
	private boolean fizzbuzz_flag=false, numb=true;
	
	public FizzBuzz(){
		presentation= new Presentation();
	} 
	
	public void check(int number){
		
		fizzbuzz_flag=false;
		numb= true;
		
		//check number div by 3 and 5 simultaneously
		if(number %3==0 && number%5==0){
			presentation.print(fizzbuzz);
			fizzbuzz_flag=true;
			numb=false;
		}
		
		// if number don't div by 3 and 5 simultaneously
		if(fizzbuzz_flag==false){
			
			if(number%3==0){
				presentation.print(fizz);
				numb= false;
			}
			if(number %5==0){
				presentation.print(buzz );
				numb= false;
			}
		}
		
		//if !fizz and !buzz and !fizzbuzz
		if(numb== true)
			presentation.print(((Integer)number).toString());
		
			
	}
	
}
