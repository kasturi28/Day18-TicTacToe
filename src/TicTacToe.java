import java.util.Scanner;

public class TicTacToe {
	
	 public static void main(String[] args) {
	        System.out.println("Welocome to Tic-tac-Toe Masters");
	        createArray();
	        System.out.println("Please enter your choice ,X - O");
	        makeChoice();
	        createBoard();
	        
	    }
	 
	    static void createArray(){
	        char[] arr = new char[10];
	        arr[0] = ' ';
	        for(int i=1; i<10; i++){
	            arr[i] = ' ';
	        }
	    }
	    
	    static void makeChoice(){

	        Scanner sc = new Scanner(System.in);
	        char user = sc.next().charAt(0);
	        char computer;
	        if (user == 'X'){
	            System.out.println("User choose X");
	            System.out.println("Computer have O");
	            computer = 'O';
	        }else {
	            System.out.println("User choose O");
	            System.out.println("Computer have X");
	            computer = 'X';
	        }
	    }
	    
	    public static void createBoard(){
	    	char[] arr = new char[10];
	        arr[0] = ' ';
	        for(int i=1; i<10; i++){
	            arr[i] = ' ';
	        }
	    	for (int i = 1; i <= arr.length - 1; i++) {
	            if (i == 3 || i == 6 || i == 9) {
	                System.out.println(arr[i]);
	            } else {
	                System.out.print(arr[i] + "_" + "|" +"_");
	            }
	        }

}
}