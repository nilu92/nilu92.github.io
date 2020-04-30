import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman
{
public static final String[] WORDS =
        {
          "Skola","Abstrakt","Mega","Hus","Skolgårdsplanen"
        };

public static final Random Random = new Random();

public static final int MAX_ERRORS = 8;

private String wordToFind;

private char[] wordFound;

private int WrongWordsCount;
// Lista på bokstäver som  är testade.
private ArrayList<String> letters = new ArrayList<>();

//Metod som random väljer ut nästa Ord.
    private String NextWord()
    {
     return WORDS[Random.nextInt(WORDS.length)];
    }
public void newGame()
{
    WrongWordsCount = 0;
    letters.clear();
    wordToFind = NextWord();

    wordFound = new char[wordToFind.length()];

    for (int i = 0; i < wordFound.length; i++) {
        wordFound[i] = '_';
    }
}

    public boolean wordFound() {
        return wordToFind.contentEquals(new String(wordFound));
    }


    private String wordFoundContent() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < wordFound.length; i++) {
            builder.append(wordFound[i]);

            if (i < wordFound.length - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    private void  enter(String c)
    {
        if(!letters.contains(c))
        {
            if(wordToFind.contains(c))
            {
                int index = wordToFind.indexOf(c);

                while (index >= 0)
                {
                    wordFound[index] = c.charAt(0);
                    index = wordToFind.indexOf(c,index + 1);
                }

            }else
                {
                    WrongWordsCount++;
                }
            letters.add(c);
        }
    }
public void play()
{
    try(Scanner input = new Scanner(System.in))
    {
        while(WrongWordsCount < MAX_ERRORS)
        {

            
        }
    }
}



}