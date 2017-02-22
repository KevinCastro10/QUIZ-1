import java.util.Scanner;
public class QB_Rating {

	public static void main(String[] args) {
		
Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter number of passing attempts:");
		
		double ATT = Integer.parseInt(user_input.next());
		
		System.out.println("Enter number of completions:");
		
		double COMP = Integer.parseInt(user_input.next());
		
		System.out.println("Entering number of passing yards:");
		
		double YDS = Integer.parseInt(user_input.next());
		
		System.out.println("Enter number of touchdown passes:");
		
		double TD = Integer.parseInt(user_input.next());
		
		System.out.println("What is the number of interceptions");
		
		double INT = Integer.parseInt(user_input.next());
		
		double w = ((COMP/ATT)-.3) * 5;
		double a = 0;
		if (w > 2.375) {
			a = 2.375;
		}
		
		else if (w < 0) {
			a = 0;
		}
		
		double x = ((YDS/ATT)-3)*.25;
		double b= 0;
		if (x > 2.375) {
			b = 2.375;
		}
		
		else if (x < 0) {
			b = 0;
		}
		
		double y = (TD/ATT)*20;
		double c= 0;
		if (y > 2.375) {
			c = 2.375;
		}
		
		double z = 2.375 - ((INT/ATT)*25);
		double d = z;
		if (z < 0) {
			d=0;
		}
		
		double xx = ((a+b+c+d)/6)*100; 
		
		double pass_rating = Math.round(xx * 10.0)/10.0;
		System.out.println(pass_rating);
		
	}

}
