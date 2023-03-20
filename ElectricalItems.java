package onesoft.course.day16Java8;

public interface ElectricalItems {
	public default String findWorkingState(boolean isOnOff) {
		if(isOnOff==true) {
			return "It is Working";
		}
		else {
			return "Not Working";
		}
	}

}
