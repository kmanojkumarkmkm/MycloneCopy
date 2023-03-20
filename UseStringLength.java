package onesoft.course.day16Java8;

public class UseStringLength {
	public static void main(String[]args) {
		StringLength l = a-> { for(int i=0;i<a.length;i++) {
			if(a[i].length()>=5) {
				System.out.println(a[i]);
				
			}
		}
		};
		String [] values = {"Jagan","Hanif","Mani","Mani"}; 
		l.checkStringLength(values);
		}

}
