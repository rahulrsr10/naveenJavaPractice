package naveenJavaPractice;

public class PrintNosWithoutUsingRecurrsion {

	public static void main(String[] args) {
	printNos(1);

	}
	public static void printNos(int nos) {
		if(nos<=100) {
			System.out.println(nos);
			nos++;
			printNos(nos);
		}
		
	}
}
