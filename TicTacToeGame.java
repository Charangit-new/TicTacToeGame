import java.util.Scanner;

public class TicTacToeGame {
		char array[] = new char[10];
		int count=0;
		public static void main(String[] args) {
		TicTacToeGame board = new TicTacToeGame();
		board.initGame();
		board.inputMark();
		board.displayBoard();
		}	

		public void initGame(){
			for(int i=0;i<array.length;i++){
			array[i] = Character.forDigit(++count , 10);
			}
		}

		public void inputMark() {
			Scanner sc = new Scanner(System.in);
			char computerMark, playerMark;
			System.out.print("Enter Player 1  mark (Select X or O): " );
			playerMark = sc.next().charAt(0);
			if (playerMark == 'X'){
				computerMark = 'O';
			}
			else{
				computerMark = 'X';
			}
	}
		
		public void displayBoard() {
			for(int i=0;i<array.length ;i++ ){
				if(i == 3 || i == 6){
					System.out.println();
				}
				System.out.print(array[i]+ " ");
				
			}
		}
}