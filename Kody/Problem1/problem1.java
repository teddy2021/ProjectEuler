
public class problem1{
	public static void main(String[] args){
		int three = 1000/3;
		int five = 1000/5;
		int fifteen = 1000/15;
		five -= 1;

		three = (three*(three + 1))/2 * 3;
		five = (five * (five + 1)) / 2 * 5;
		fifteen = (fifteen * (fifteen + 1))/2 * 15;

		System.out.println(three + five - fifteen);
	}
}
