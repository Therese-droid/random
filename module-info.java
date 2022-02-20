
	import java.io.*;
	import java.math.*;
	import java.util.*;
	class RandomNumberGuessor { 
	public static void main (String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String choice;
	while(true)
	{
	/*
	int randNum = RNG.rand(100);
	 //Use RNG class in that you created
	*/
	int randNum =(int) (Math.random()*(100-0+1)+0); 
	//Using this method to generate random number for testing here
	//System.out.println(randNum);
	int lowGuess=0,highGuess=100,guessNum=0;
	System.out.println("Enter your first guess");
	int nextGuess=Integer.parseInt(br.readLine());
	while(true)
	{
	guessNum++;
	if(nextGuess==randNum){
	System.out.println("Number of guesses is " + guessNum);
	System.out.println("Congratulations, you guessed successfully");
	break;
	}else
	if(nextGuess>randNum){
	System.out.println("Number of guesses is " + guessNum);
	highGuess=nextGuess;
	System.out.println("Yor guess is too high");
	System.out.println("Enter your next guess between "+lowGuess+" and "+highGuess);
	nextGuess=Integer.parseInt(br.readLine());
	while(nextGuess<lowGuess || nextGuess>highGuess){
	System.out.println("Guess must be between "+lowGuess+" and "+highGuess+" Try again");
	nextGuess=Integer.parseInt(br.readLine());
	}
	}
	else
	if(nextGuess<randNum){
	System.out.println("Number of guesses is " + guessNum);
	lowGuess=nextGuess;
	System.out.println("Yor guess is too low");
	System.out.println("Enter your next guess between "+lowGuess+" and "+highGuess);
	nextGuess=Integer.parseInt(br.readLine());
	while(nextGuess<lowGuess || nextGuess>highGuess)
	{
	System.out.println("Guess must be between "+lowGuess+" and "+highGuess+" Try again");
	nextGuess=Integer.parseInt(br.readLine());
	}
	}
	}
	System.out.println("Try again? (yes or no)");
	choice=br.readLine();
	if(choice.equals("no"))
	{
	break;
	}
	}
	System.out.println("Thanks for playing...");
	}
	}
