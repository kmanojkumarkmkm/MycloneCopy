package onesoft.course.day16Java8;

public interface Car {
	public static String findBrand(String brand) {
		return brand;
	}
	public default String findHeadLightCondition(boolean isOnOff) {
		if(isOnOff==true) {
			return "It is Working";
		}
		else {
			return "Not Working";
		}
	}
	public String findPrice(int price);
}
