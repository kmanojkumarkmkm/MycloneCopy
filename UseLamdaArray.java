package onesoft.course.day16Java8;

public class UseLamdaArray {
	public static void main(String[]args) {
	LamdaArray l = a-> { for(int i=0;i<a.length;i++) {
		if(a[i]>0) {
			System.out.println(a[i]);		
		}
	}
	};
	int [] nums = {-20,0,50,60,80,-40}; 
	l.findPositiveNumber(nums);
	}
}
