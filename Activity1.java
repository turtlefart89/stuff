
public class Activity1 {

	public static void main(String[] args) {
		
		int rows = 4;
		int columns = 5;
		int[][] numbers = new int[rows][columns];
		
		for(int i =0; i < rows; i++){
			for(int j = 0;j<columns;j++){
				
				numbers[i][j] = (int)(10.0 * Math.random() +1);
			}
		}
		
		for(int i =0; i < rows; i++){
			for(int j = 0;j<columns;j++){
				
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
