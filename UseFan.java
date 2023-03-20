package onesoft.course.day16Java8;

public class UseFan {
	public static void main(String[]args) {
		Fan ip = new Fan();
		ip.findBrand("Crompton");
		ip.findPrice(120);
		System.out.println(ip.findBrand("Crompton"));
		System.out.println(ip.findPrice(250));
		System.out.println(Pen.findBrand("Kaithan"));
	}
}
