package onesoft.course.day16Java8;

public interface ElectricalItems {
	public default String findWorkingState(boolean isOnOff) {
		if(isOnOff==false) {
			return "It is Not Working";
		}
		else {
			return "It is Working";
		}
	}

}
