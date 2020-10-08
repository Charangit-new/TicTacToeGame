import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
		char array[] = new char[10];
		int count=0;
		char computerMark, playerMark;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
		TicTacToeGame board = new TicTacToeGame();
		board.initGame();
		board.displayBoard();
		board.inputMark();
		}	

		// initialize Game
		public void initGame(){
			for(int i=0;i<array.length;i++){
			array[i] = Character.forDigit(++count , 10);
			}
		}

		// Get user Input 
		public void inputMark() {
			System.out.print("Enter Player 1  mark (Select X or O): " );
			playerMark = sc.next().charAt(0);
			if (playerMark == 'X'){
				computerMark = 'O';
			}
			else{
				computerMark = 'X';
			}
			selectMove(computerMark,playerMark);
	   }
		
		// display the Board
		public void displayBoard() {
			for(int i=0;i<array.length ;i++ ){
				if(i == 3 || i == 6){
					System.out.println();
				}
				System.out.print(array[i]+ " ");		
			}
			System.out.println();
		}
		
		// get the user choice
		public void selectMove(char computerMark , char playerMark) {
			System.out.println();
			int num = random.nextInt(2);
			if (num==1) {
				System.out.println("Player 1 wins toss");
				System.out.println();
				getInput(num);
			}
			else{
				System.out.println("Computer wins toss" );
				System.out.println();
				getInput(num);
			}
		}
		
		
		public void getInput(int num) {
			char choice;
			String user ;
			if(num==1) {
				user = "Player 1";
				System.out.print(user +  " : Enter  choice : ");
				choice = sc.next().charAt(0);
				if(checkIfFilled(choice) == true ) {
						replace(choice,playerMark);
						displayBoard();
				}
				else {
					getInput(num);
				}
			 }
			else {
				 user = "Computer";
				 choice= Character.forDigit(random.nextInt(9)+1 , 10);
				 System.out.println(user + ": Enter choice : " + choice);
				 if(checkIfFilled(choice) == true ) {
						replace(choice,computerMark);
						displayBoard();
				}
				else {
					getInput(num);
				}
		}				
}	

		// checking for empty choices
		public boolean checkIfFilled(char choice) {
			boolean isEmpty=true;
			for(int i=0;i<array.length;i++){
				if(array[i] != choice) {
					isEmpty = false;
 				}
				else {
					isEmpty = true; 
					break;
				}
			}	
			return isEmpty;
		}
		

		// replace the selected choice with user mark
		public void replace(char choice,char userMark){
			for(int i=0;i<array.length ;i++) {
				if(array[i] == choice){
					array[i]=userMark;
				}
	    }	
	}				
}
