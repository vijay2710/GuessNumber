import java.util.Scanner;




public class GuessNumber{
    private static class Guesser{       
    private int lower;
    private int upper;
    //define constructor
    public Guesser(int l,int u){
    	lower = l;
    	upper = u;
      

    }
    public void quiz(){
    	System.out.println("Think of a number between " + lower + " and "  + upper );
    	int temp;
    	Scanner sc = new Scanner(System.in);
    		int l = lower;
    		int u = upper;
    		while(l!=u){
    		temp = l + (u-l)/2;
    		System.out.println("is it greater than " + temp +" ? ");
    		if(sc.next().equals("y")){
            l = temp+1;
    		}
    		else{
            u = temp;
    		}

    	}
    System.out.println("Your number is " + u);
    }
   
    }
	public static void main(String[] args){
	//	Guesser g=new Guesser();
		int lower= 0;
		int upper = 16;
		Guesser g = new Guesser(lower,upper);
		g.quiz();


	}
}