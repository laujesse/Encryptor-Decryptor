
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    public String message;
  
    public String Engima(String inputString)
    {
        this.message = inputString;
        return this.message;
    }
    public String getMessage()
    {
        return this.message;
    }
    
    public String getEncryption(String message, int shift)
    {
        String newmessage = message.toUpperCase();
        String newmessage2 = newmessage.replaceAll("\\s","");
        String endproduct = "";
        int len = newmessage2.length();
        int j = 0;
        for (j = 0; j < len; j++)
        {
            char c = (char)(newmessage2.charAt(j) + shift);
            if (c > 'z')
            {
                endproduct += (char)(newmessage2.charAt(j) - (26 - shift));
            }
            else 
            {
                endproduct += (char)(newmessage2.charAt(j) + shift);
            }
        } 
        return endproduct.toLowerCase();
    }
    public String getDecryption(String endproduct, int shift)
    {
        String newendproduct = endproduct.toUpperCase();
        String finalendproduct = "";
        int k = newendproduct.length();
        int i = 0;
        for (i = 0; i < k; i++)
        {
            char b = (char)(newendproduct.charAt(i) - shift);
            if (b > 'z')
                finalendproduct += (char)(newendproduct.charAt(i) + (26 - shift));
            else
                finalendproduct += (char)(newendproduct.charAt(i) - shift);
        }
        return finalendproduct.toLowerCase();
    }
 
    
}
    

