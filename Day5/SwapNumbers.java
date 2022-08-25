package Day5;

public class SwapNumbers {
	public static void main(String[] args) {
		
		float first = 1.5f, second =2.5f;
		
		System.out.println("--Before swap--");
		System.out.println("First number = "+ first);
		System.out.println("Second number = "+ second);
		
		first = first - second;
		second = first + second;
		first = second - first;
		
		System.out.println("--After swap--");
		System.out.println("first number = " + first);
		System.out.println("second number = " + second);
				
	}

}
