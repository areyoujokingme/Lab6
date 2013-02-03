//e. has a class that tells a story with random elements (similar to mad libs or a choose your own
//adventure story),

import java.util.Scanner;

public class MadLibs
{
  private static Scanner myInputDevice;
	public static void Fill_In()
	{//fill in start
		String ADJ="";
		String NOUN="";
		String VERB="";
		String VERB2="";
		String AMOUNT="";
		String LOCATION="";
		String Sentence_1="";
		String Sentence_2="";
		String Sentence_3="";
		String Sentence_4="";
		String Sentence_5="";
		String Sentence_6="";
		String Sentence_7="";
		String DoneBefore = "NO";
		int i=0;
		
		System.out.println("This is a story of a young princess who lived in a far away land.");
		System.out.printf("For every pause in the story, please enter the appropriate part of\nspeech in order for the story to continue");
		System.out.println("Great! Let us begin!");
		System.out.printf("We will reveal parts of the story one random sentence at a time. At\n the end, you will see your final result.");
		
		while (i<7)
		{
			int RandomSentence = (int)(Math.random()*20);

			if (RandomSentence==1 && DoneBefore.indexOf('N')==0);
			{
				System.out.println("Once upon a time, there was a lovely princess who was lonely and ________");
				System.out.println("Enter an adjective: ");
				ADJ = myInputDevice.next();
				Sentence_1 = "Once upon a time, there was a lovely princess who was lonely and" + ADJ;
				System.out.println("");
				DoneBefore = "YES";
				i++;
			}
			
			if (RandomSentence==2 && DoneBefore.indexOf('N')==0);
			{
				System.out.println("The princess had no friends to ________ and ________ with.");
				System.out.println("Enter a verb: ");
				VERB = myInputDevice.next();
				System.out.println("Enter another verb: ");
				VERB2 = myInputDevice.next();
				Sentence_2 = "The princess had no friends to " + VERB + " and " + VERB2 + " with.";
				DoneBefore = "YES";
				i++;
			}
			
			if (RandomSentence==3 && DoneBefore.indexOf('N')==0);
			{
				System.out.println("One day, she decided to leave her castle on a ______ to find a million bucks, mostly because she was _______.");
				System.out.println("Enter a noun: ");
				NOUN = myInputDevice.next();
				System.out.println("Enter an adjective: ");
				ADJ = myInputDevice.next();
				Sentence_3 = "One day, she decided to leave her castle on a " + NOUN + " to find a million bucks, mostly because she was " + ADJ + ".";
				DoneBefore = "YES";
				i++;
			}
			
			if (RandomSentence==4 && DoneBefore.indexOf('N')==0);
			{
				System.out.printf("The princess searched long and hard for her _______ ________, \nbut by the end of the day had no more George Washingtons, and no more \nfriends than before.");
				System.out.println("Enter a adjective: ");
				ADJ = myInputDevice.next();
				System.out.println("Enter a noun: ");
				NOUN = myInputDevice.next();
				Sentence_4 = "The princess searched long and hard for her " + ADJ + NOUN + " but by the end of the day had no more George Washingtons, and no more friends than before.";
				DoneBefore = "YES";
				i++;
			}
			
			if (RandomSentence==5 && DoneBefore.indexOf('N')==0);
			{
				System.out.printf("\"Why is life so _______?\" the princess thought to herself.");
				System.out.println("Enter a adjective: ");
				ADJ = myInputDevice.next();
				Sentence_5 = "\"Why is life so " + ADJ + "?\" the princess thought to herself.";
				DoneBefore = "YES";
				i++;
			}
			
			if (RandomSentence==6 && DoneBefore.indexOf('N')==0);
			{
				System.out.printf("Suddenly, the winds blew a(n) _______ of pollen into her face.");
				System.out.println("Enter an amount, such as \"a wee bit\", an ounce, or a ton: ");
				AMOUNT = myInputDevice.next();
				Sentence_6 = "Suddenly, the winds blew a(n) " + AMOUNT + " of pollen into her face.";
				DoneBefore = "YES";
				i++;
			}
			
			if (RandomSentence==7 && DoneBefore.indexOf('N')==0);
			{
				System.out.printf("The princess _______ and realized in that moment that the million bucks she sought was ________.");
				System.out.println("Enter a verb: ");
				VERB = myInputDevice.next();
				System.out.println("Enter a location: ");
				LOCATION = myInputDevice.next();
				Sentence_7 = "The princess " + VERB + " and realized in that moment that the million bucks she sought was " + LOCATION + ".";
				DoneBefore = "YES";
				i++;
			}
		}
		
		System.out.printf(Sentence_1 + Sentence_2 + Sentence_3 + Sentence_4 + Sentence_5 + Sentence_6 + Sentence_7);
		
	}


}
