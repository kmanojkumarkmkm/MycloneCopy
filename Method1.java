package onesoft.course.day16Java8;

public class Method1 {
	public String findMini (int[]a) {	
		int mini = a[0];
		for(int i=0;i<a.length;i++){
			if (a[i]<=mini) {
				mini = a[i];
		}	
		}
		return "Minimun = "+mini;
		
	}
	public static void main (String[]args) {
		Method1 m = new Method1();
		int [] ages = {10,15,30,18,20,25};
		System.out.println(m.findMini(ages));
		
	}

}
