import java.util.Scanner;
class Trigoseries
{
    private double x;
    private int n;
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of 'x' and 'n' for the Cosine series below: ");
        System.out.print("x = ");
        x= sc.nextDouble();
        System.out.print("n = ");
        n= sc.nextInt();
    }
    
    double power(double x, int n)
    {
        return n==0? 1 : x * power(x, n-1);
    }
    
    int factorial(int n)
    {
        return n==0? 1 : n * factorial(n-1);
    }
    
    double sumSeries()
    {
        double sum= 0;
        int i, sign= -1;
        for(i=0; i<=n; i+=2)
        {
            sign*=-1;
            sum+= (power(x, i)/factorial(i)) * sign;
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        Trigoseries obj= new Trigoseries();
        obj.input();
        System.out.println("\nThe sum of the given series: "+(float)obj.sumSeries()); 
    }
}