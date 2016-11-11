import java.util.Scanner;
public class Activity3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int rows = 5;
		int columns = 6;
		int answer;
		int[][] numbers = new int[rows][columns];
		
		for(int i =0; i < rows; i++){
			for(int j = 0;j<columns;j++){
				
				numbers[i][j] = (int)(1000.0 * Math.random() +1);
			}
		}
		
		System.out.println("What number?");
		answer = input.nextInt();

		System.out.println("Highest Value: " +getHighest(numbers));
		System.out.println("Lowest Value: " +getLowest(numbers));
		System.out.println("Average Value: " +getAverage(numbers));
		System.out.println(getAbove(numbers, answer));
	}


	static int getHighest(int [][] numbers){
		
		int highest = 0;
		
		for(int i = 0; i < numbers.length; i++){
			for (int j = 0; j <numbers[i].length; j++){
				if(numbers[i][j] > highest){
					
					highest = numbers[i][j];
				}
				
			}
			
		}
		
		 return highest;
	}
	
	static int getLowest(int [][] numbers){
		
		int lowest = 1000;
		
		for(int i = 0; i < numbers.length; i++){
			for (int j = 0; j <numbers[i].length; j++){
				if(numbers[i][j] < lowest){
					
					lowest = numbers[i][j];
				}
				
			}
			
		}
		
		 return lowest;
	}
	
	static int getAverage(int [][] numbers){
		
		int average;
		int total = 0;
		for(int i = 0; i < numbers.length; i++){
			for (int j = 0; j <numbers[i].length; j++){
			
					total += numbers[i][j];
				
			}
			
		}
		
		average = total / (5*6);
		return average;

	}
	
	
	static int getAbove(int [][] numbers, int answer){
		
		int elementN = 0;
		for (int i= 0; i < 5; i++){
			for (int j = 0; j< 6; j++){
				if(numbers[i][j]>answer){
					elementN++;
				}
				
			}
		}
		return elementN;
	}

}
