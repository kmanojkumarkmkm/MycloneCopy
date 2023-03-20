package onesoft.course.day16Java8;

public class UseCheckMaximumAge {
	public static void main(String[]args) {
		CheckMaximumAge l = (a,b,c)-> {if(a>b&&a>c) {
			System.out.println(a+" is Maximum");			
			}
		else if(b>a&&b>c) {
			System.out.println(b+" is Maximum");
		}
		else {
			System.out.println(c+" is Maximum");
		}
		};
		l.checkMaximumAge(35, 28, 42);
		}

}
