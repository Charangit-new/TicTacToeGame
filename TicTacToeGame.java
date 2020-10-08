import java.util.Scanner;

public class TicTacToeGame {
		char array[] =new char[10];
		public static void main(String[] args) {
		TicTacToeGame board = new TicTacToeGame();
		board.initGame();
		board.inputMark();
		}	

			public void initGame(){
			for(int i=0;i<10;i++){
			array[i]=' ';
			}
		}

		public void inputMark() {
		Scanner sc = new Scanner(System.in);
		char computerMark, playerMark;
		System.out.println("Enter Player 1  mark (Select X or O): " );
		playerMark = sc.next().charAt(0);
		if (playerMark == 'X'){
		computerMark='O';
		}
		else{
		computerMark='X';
		}
	}
}