package onesoft.course.day16Java8;

public class Mobile implements ElectricalItems{
	public String findWorkingState(boolean isOnOff) {
		if(isOnOff==true) {
			return "Display is broken";
		}
		else {
			return "Not Working";
		}
	}

}
