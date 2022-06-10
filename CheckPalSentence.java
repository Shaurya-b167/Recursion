import java.util.Scanner;
class CheckPalSentence
{
    private String str;
    
    CheckPalSentence(String s)
    {
        str= s;
    }
    
    boolean isPalindrome(int p1, int p2)
    {
        char ch= str.charAt(p1);
        char chr= str.charAt(p2);
        if(p1==p2)
            return true;
        if(Character.isLetterOrDigit(ch) && Character.isLetterOrDigit(chr))
        {
            if(Character.toLowerCase(ch) !=  Character.toLowerCase(chr))
                return false;
            else
            {
                p1+=1;
                p2-=1;
            }
        }
        else if(!Character.isLetterOrDigit(ch))
           p1+=1;
        else 
           p2-=1;
        if(p1<p2+1)
            return isPalindrome(p1, p2);
        return true;
    } 
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string to check for Palindromic string: ");
        String st= sc.nextLine();
        
        CheckPalSentence obj= new CheckPalSentence(st);
        System.out.println("\nThe given string is "+(obj.isPalindrome(0, st.length()-1)? "":"not ")+
               "a Palindromic string!");
    }  
}
/*
Was it a CAR,,,,,,,, or a caT,,,, I SAW???????
                          |
                          |
                         \/
                 wasitacaroracatisaw */                        