import fizzbuzz.com.*;

public class Client {

	public static void main(String[] args) {
		
		FizzBuzz fizzBuzz= new FizzBuzz();
		
		for(int i=1; i<100; i++){
			fizzBuzz.check(i);
		}
	}

}
