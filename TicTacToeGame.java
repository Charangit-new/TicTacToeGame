import java.util.Scanner;

public class TicTacToeGame {
		char array[] = new char[10];
		int count=0;
		char computerMark, playerMark;
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
			char choice;
			for (int i = 1; i <=8; i++) {
					System.out.println("Enter player 1 choice : ");
					choice = sc.next().charAt(0);
					replace(choice,playerMark);
					displayBoard();
					System.out.println("Enter computer player choice : ");
					choice = sc.next().charAt(0);
					replace(choice,computerMark);
					displayBoard();
			}
				System.out.println("Enter player 1 choice : ");
				int choice1 = sc.nextInt();
				char choice2 = (char) choice1;
				replace(choice2,playerMark);
				displayBoard();
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
