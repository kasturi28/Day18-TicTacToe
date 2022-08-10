
public class TicTacToe {
	
	 public static void main(String[] args) {
	        System.out.println("Welocome to Tic-tac-Toe Masters");
	        createArray();
	    }
	 
	    static void createArray(){
	        char[] arr = new char[10];
	        arr[0] = ' ';
	        for(int i=1; i<10; i++){
	            arr[i] = ' ';
	        }
	    }

}
