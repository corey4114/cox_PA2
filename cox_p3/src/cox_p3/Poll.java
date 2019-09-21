package cox_p3;

import java.util.Scanner;

public class Poll {
	
	private static Scanner input;
	static String[] s = {"Story plot", "Gameplay", "Character development", "Graphics", "Replayability"};
	static int[][] a = new int[5][10];
	
	public static void main(String[] args){

	   int loops;
	   int maxI = 0, minI = 0;
	   double[] sum = {0,0,0,0,0};
	   double max = sum[0], min = sum[0], average = 0;
	   
	   input = new Scanner(System.in);
	   //how many people are taking the survey
	   System.out.print("How many people are taking this survey?");
	   loops = input.nextInt();
	   
	   //loop for each person taking the poll
	   System.out.print("Please rate each topic relating to video games on a scale of importance from 1-10\n");
	   for(int i=0;i<loops;i++){
	       for(int j=0;j<5;j++){
	           System.out.print("\n" + (j+1) + "." + s[j] + ": ");	               
	           a[j][i]=input.nextInt();           
	       }     
	   }
	   
	   System.out.print("\nTabular Report\n");
	   //results screen
	   for(int i=0; i<5; i++){
	       System.out.print("\n" + (i+1) + "." + s[i] + ": ");
	       for(int j=0; j<loops; j++){
	           System.out.print(a[i][j] + "     ");
	           sum[i] = sum[i] + a[i][j];
	       }
	       average = sum[i]/loops;
	       System.out.print("Average: " + average);
	   }
	   // High/Low values
	   for(int i=0; i<5; i++){
	       if(max<sum[i]){
	           max = sum[i];
	           maxI = i;
	       }
	       if(min>=sum[i]){
	           min = sum[i];
	           minI = i;
	       }
	   }
	   
	   System.out.print("\n\nHighest point total: " + s[maxI]+"\tTotal points: "+max);
	   System.out.print("\nLowest point total: " + s [minI]+"\tTotal points: "+min);	  
	   }

	  
	
		

	

}
