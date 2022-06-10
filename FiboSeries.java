import java.util.Scanner;
class FiboSeries
{
    private int n;
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit for the fibonacci series: ");
        n= sc.nextInt();
    }
    
    int getFibo(int n) 
    {
        return n==1 ? 0 : n==2 ? 1 :  getFibo(n-2) + getFibo(n-1);
    }
     
    void generate()
    {
        int sum=0, num=0, i;
        System.out.println("\nThe fibonacci series till limit "+n+": ");
        for(i=1; num<=n; i++)
        {
            sum+= num= getFibo(i);
            System.out.print(num>n? "" : num+(num==n? "":", "));           
        }
        System.out.print("\nSum of the given series: "+(sum-num));  
    }
    
    public static void main(String[] args)
    {
        FiboSeries obj= new FiboSeries();
        obj.input();
        obj.generate();
    }
}  