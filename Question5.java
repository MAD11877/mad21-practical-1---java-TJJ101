import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
	  int start = in.nextInt(),x;
	  int [] values = new int[start];
	  int [] check =new int[start];
	  for(int a=0;a<start;a++) {
		  values[a]=in.nextInt();
		}
	  {
	    for(int a=0;a<start;a++) {   
        x=1;
        if(values[a]==-1){
          check[a]=0;
        }
        else{
          for(int b=a+1;b<start;b++) 
	      {
		      if(values[a]==values[b]){
            x++;
            values[b]=-1;
          }         
	      }
          check[a]=x;
        }
	    }
      int num=check[0];
      for(int i=1;i<start;i++){
	      if(check[i]>=num)
          num=check[i];   	
	    }
	    for(int i=0;i<start;i++){
	      if(check[i]==num)
          System.out.println(values[i]);
	    }
	  }
    in.close();
  }
}
