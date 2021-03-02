
public class TestDoubleCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double percent = 0.0;
		double count = 0.0;
		
		int percentInt;
		int countInt =14;
		System.out.println("Count is 14");
		int matrixSize = 200;
		System.out.println("Matrix sze is 200");
		
		System.out.println("We are obtaining the percent count of total matrix\n");
		
		percent=countInt/matrixSize;
		System.out.println("Percent using int div int is:  " + percent); //result is 0 .0 instead of 0.07
		System.out.println("Result of the division is less than zero, so when converted to double, is zero\n");
		
		percent= (double) countInt/matrixSize;
		System.out.println("Percent using (double) int div int is:  " + percent); //result is  0.07
		System.out.println("countInt is cast to double before division, so result of division is the double 0.07\n");
		
		percent = (double) (count/matrixSize);
		System.out.println("Percent using (double) (int div int) is:  " + percent); //result is  0.0 instead of 0.07
		System.out.println("In this case, the division occurs before the casting, so result is 0.0\n");
		
		//other way
		percentInt = (countInt*100)/(matrixSize);
		System.out.println("Percent using integers:  " + percentInt + "%");
		System.out.println("this is a common way of handling percentages and Java has built in classes/interfaces/libraries to help");
		
		
		
	
		
		
		
		
		

	}

}
