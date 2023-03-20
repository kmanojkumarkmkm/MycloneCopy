package onesoft.course.day16Java8;

public class UseCalculator {
	public static void main(String[]args) {
		Calculator add = (a,b)-> a+b;
		Calculator sub = (c,d)-> c-d;
		System.out.println(add.maths(18,19));
		System.out.println(sub.maths(20,16));
		Calculator.printOperation("Addition");
		add.activity();
	}

}
