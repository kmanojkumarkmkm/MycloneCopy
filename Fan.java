package onesoft.course.day16Java8;

public class Fan implements Electronics {
	public String findPrice(int price) {
		if(price>100) {
			return "High Price Pen";
		}
		else {
			return "Normal Pen";
		}
	}
	public String findBrand(String brand) {
		return "Brand="+brand;
	}

}
