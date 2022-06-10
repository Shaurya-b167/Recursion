import java.util.Scanner;
class Palindrome
{
    private int num;

    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to convert to Paindrome: ");
        num= sc.nextInt();
    }

    int reverse(int n, int m)
    {
        return n==0 ? m : reverse(n/10, (m*10 + n%10));
    } 

    int makePalindrome()
    {
        int rev = reverse(num, 0);
        if(num==rev)
            return num;
        num+= rev;
        return makePalindrome();
    } 

    public static void main(String[] args)
    {
        Palindrome obj= new Palindrome();
        obj.input();
        System.out.println("\nThe palindrome number found: "+obj.makePalindrome());
    } 
}