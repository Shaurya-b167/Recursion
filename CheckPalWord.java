import java.util.Scanner;
class CheckPalWord
{
    private String str;
    
    CheckPalWord(String s)
    {
        str= s;
    }
    
    String reverse(String str)
    {
        return str.length()==0 ? str : reverse(str.substring(1)) + str.charAt(0);
    } 
    
    boolean isPalindrome()
    {
        return str.equalsIgnoreCase(reverse(str)) ? true : false;
    }     
    
    public static void main(String[] args)
    {  
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string to check for Palindrome string: ");
        String st= sc.nextLine();
        
        CheckPalWord obj= new CheckPalWord(st);
        System.out.println("\nThe given string is "+(obj.isPalindrome()? "" : "not ")+"a Palindromic string!");
    } 
} 