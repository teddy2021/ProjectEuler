
public class problem{
	public static void main(String[] args){
		int sum = 0;
		int fib1 = 1, fib2 = 0, fib3 = 0;
		do{
			fib3 = fib1 + fib2;
			if(fib3 %2 == 0){
				sum += fib3;
			}
			fib2 = fib1;
			fib1 = fib3;
		}while(fib3 < 4000000);
		System.out.println(sum);
	}
}
