public class GuessNumber{

	public static void main(String[] args){
		Guesser g=new Guesser();
		int lower= 0;
		int upper = 16;
		g.newGame(lower,upper);
		g.quiz();
		

	}
}