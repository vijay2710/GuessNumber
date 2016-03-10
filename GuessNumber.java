import java.util.Scanner;




public class GuessNumber{
    private static class Guesser{       
	private int lower;
	private int upper;
	class InvalidInputException extends Exception{
	    public InvalidInputException() {}

	}
	public Guesser(int l,int u) {
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
    		boolean gt = false;
    		try{
		    gt = askIfGreaterThan(temp);

    		}
    		catch(InvalidInputException e){
		    System.out.println("please answer y or n");
		    continue;

    		}
    		if(gt){
		    l = temp+1;
    		}
    		else{
		    u = temp;
    		}

	    }

	    System.out.println("Your number is " + u);
	}
	private boolean askIfGreaterThan (int n) throws InvalidInputException{
	    boolean output;
	    Scanner sc  = new Scanner(System.in);
	    System.out.println("is it greater than " + n +" ? ");
	    String input = sc.next();
	    
	    switch (input.toLowerCase()){
		
	    case ("y"): 
    		output = true;
    		break;

	    case "n":
    		output = false;
    		break;

	    default:
    		throw new InvalidInputException(); 
	    }
	    return output;
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
