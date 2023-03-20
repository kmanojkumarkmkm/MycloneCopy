package onesoft.course.day16Java8;
@FunctionalInterface
public interface Wood {
	public static String findMaterialType(String material) {
		return material;
	}
	public default String findSurfaceCoating(boolean isEnamel) {
		if(isEnamel==true) {
			return "It is MatFinish";
		}
		else {
			return "Just Painting";
		}
	}
	public String findPrice(int price);
}
