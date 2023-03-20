package onesoft.course.day16Java8;

public class UseVoterAge {
	public static void main(String[]args) {
		VoterAge l = a-> {if(a>=18) {
			System.out.println("Eligible for Voting");			
			}
		else {
			System.out.println("Not Eligible");
		}
		};
		l.findVotingAge(42);
		}

}
