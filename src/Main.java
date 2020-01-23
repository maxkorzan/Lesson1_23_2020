import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;

       //prompt user for int
        System.out.println("Enter a number: ");
        x  = sc.nextInt();
        //SCANNER BUFFER - NEED THIS TO "EAT" UP THE USER'S LAST "ENTER" INPUT
        sc.nextLine();
        //prompt user for String
        System.out.println("Enter a string: ");
        String word = sc.nextLine();


        //READING AN EMPTY LINE
        String answer = "y";
        while (answer.equalsIgnoreCase("y")){
            System.out.println("Please enter something: ");
            String something = sc.nextLine();
            if (something.equals("")){
                break;
            }
            System.out.println(something);
        }


        //RANDOM
        Random rand = new Random();
        int y = 1+ rand.nextInt(6);
        System.out.println(x);

        //STRING METHODS
        //substring
        String word2 = "Professor";
        System.out.println(word2.substring(6,9));
        //length
        System.out.println(word2.length());
        //charat
        System.out.println(word2.charAt(3));

    }
}
