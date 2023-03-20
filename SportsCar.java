package onesoft.course.day16Java8;

public class SportsCar implements Car {
	public static String findBrand(String brand) {
		return "Brand="+brand;
	}
	public String findHeadLightCondition(boolean isOnOff) {
		if(isOnOff==true) {
			return "It is Working";
		}
		else {
			return "Not Working";
		}
	}
	public String findPrice(int price) {
		if(price>60000) {
			return "High End Model";
		}
		else {
			return "Basic Model";
		}
	}

}
