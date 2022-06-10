import java.util.Scanner;
class Number
{
    private int num;
    
    Number(int n)
    {
        num= n;
    }
    
    void exDigit(int num)
    {
        if (num==0)
           return; 
        else
        {
            exDigit(num/10);
            digitToWord(num%10);
        }
    }
    
    void digitToWord(int dig)
    {
         String arr[]= {"Zero", "One", "Two", "Three", "Four", "Five", "Six" , "Seven", "Eight", "Nine"};
         System.out.print(arr[dig]+" ");
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to display it in word format: ");
        int n= sc.nextInt();
        
        Number obj= new Number(n);
        obj.exDigit(n);
    }
}