import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int rows;
		int columns;
		int answers;
		
		System.out.println("Enter the number of rows");
		rows = input.nextInt();
		System.out.println("Enter the number of columns");
		columns = input.nextInt();
		
		int[][] numbers = new int[rows][columns];
		
		//math
		for(int i = 0; i < rows; i++){
			for (int j = 0;j < columns; j++){
				
				numbers[i][j] = (i+1) * (j+1);
				System.out.print(numbers[i][j] +" ");
				
			}
			System.out.println("");
		}
		
		
		
	}

}
