package onesoft.course.day16Java8;

public class Table implements Wood{
	public static String findMaterialType(String material) {
		return material;
	}
	public String findSurfaceCoating(boolean isEnamel) {
		if(isEnamel==true) {
			return "It is Termite Resistant";
		}
		else {
			return "It is not Termite Resistant";
		}
	}
	public String findPrice(int price) {
		return "Price="+(price+price*5/100);
	}

}
