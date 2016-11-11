import java.util.Scanner;
public class Activity4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[][] scores = new int[4][4];
		int grade = 0;
		int id = 0;
		
		for(int i =0; i < 4; i++){
			System.out.println("Enter student ID");
			int ida = input.nextInt();
			for(int j = 0;j<3;j++){
				System.out.print("Enter student number " +id +"'s grade");
				int gradea = input.nextInt();
				if(gradea>grade){
					grade = gradea;
					id = ida;
				}
				
			}
			System.out.println("");
			
		}
		System.out.println(grade + "is the highest by ID" +id);
		
		
		

	}

}
