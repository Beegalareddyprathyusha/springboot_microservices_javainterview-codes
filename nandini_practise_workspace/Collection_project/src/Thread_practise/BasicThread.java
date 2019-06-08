package Thread_practise;

import java.util.ArrayList;
import java.util.List;

public class BasicThread {
    static int row ;
	static int coulmn;
   
	public static void main(String[] args) throws InterruptedException {
		List<String> cmds = new ArrayList<>();
		cmds.add("RIGHT");
		cmds.add("RIGHT");
		cmds.add("DOWN");
	
		System.out.println(roverMove(4 ,cmds ));
		

	}
	 public static int roverMove(int matrixSize, List<String> cmds) {
		 
		 for(int k = 0 ; k < cmds.size() ; k++ ){
			 if(cmds.get(k).equals("UP")){
				 Up();
			 }
			 if(cmds.get(k).equals("DOWN")){
				 Down(matrixSize);
			 }
			 if(cmds.get(k).equals("LEFT")){
				 Left();
			 }
			 if(cmds.get(k).equals("RIGHT")){
				 Right(matrixSize);
			 }
		 }
		return (row * matrixSize) + coulmn;
		
		    }
	 
	 
	 private static void Up(){
		 if(row > 0){
			 row =row- 1;
		 }
	 }
	 
	 private static void Down(int matrixSize){
		 if(row < (matrixSize-1)){
			 row =row+ 1;
		 }
	 }
	 
	 private static void Left(){
		 if(coulmn > 0){
			 coulmn =coulmn- 1;
		 }
	 }
	 
	 private static void Right(int matrixSize){
		 if(coulmn < (matrixSize-1)){
			 coulmn =coulmn+ 1;
		 }
	 }
}



