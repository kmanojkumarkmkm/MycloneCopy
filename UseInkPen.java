package onesoft.course.day16Java8;

public class UseInkPen {
	public static void main(String[]args) {
		InkPen ip = new InkPen();
		ip.findBrand("Cello");
		ip.findPrice(25);
		System.out.println(ip.findBrand("Cello"));
		System.out.println(ip.findPrice(25));
		System.out.println(Pen.findBrand("Natraj"));
	}

}
