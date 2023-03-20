package onesoft.course.day16Java8;

@FunctionalInterface
public interface Calculator {
		public static void printOperation(String a) {
			System.out.println(a);
		}
		public default void activity() {
			System.out.println();
		}
		public int maths(int x,int y);

}
