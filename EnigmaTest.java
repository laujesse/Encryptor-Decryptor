
/**
 * Write a description of class EnigmaTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EnigmaTest
{
    public static void main(String [] args)
    {
        Enigma lmao = new Enigma();
        Scanner kb = new Scanner(System.in);
        String userinput, userinput2, userchoice;
        int r = 0;
        System.out.println("Please enter the message you want to encrypt: ");
        userinput = kb.nextLine();
        userinput2 = userinput.replaceAll("\\s+","");
        System.out.println("This is your encrypted message: " + lmao.getEncryption(userinput2, 3));
        while ( r == 0)
        {
        Scanner kb2 = new Scanner(System.in);
        System.out.println("Please type 'one' if you want your message decrypted, 'two' if you don't want to:" );
        userchoice = kb2.next();   
        if (userchoice.equals("one")) 
        {
            System.out.println("This is it decrypted!: ");
            System.out.println(lmao.getDecryption(lmao.getEncryption(userinput2, 3), 3));
            break;
        }
        if (userchoice.equals("two"))
        {
            System.out.println("Thank you for using our encryption/decryption service.");
            break;
        }
        else
        {
            System.out.println("What you have entered is invalid. Please try again.");
            continue;
        }
        }
    }
}
