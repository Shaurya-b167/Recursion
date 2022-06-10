import java.util.Scanner;
class Factors
{
    private int num;

    Factors(int n)
    {
        num= n;
    }

    boolean isPrime(int n, int f)
    {
        if(n==2)
            return true;
        else if(n%f==0 || n<2)
            return false;
        else if(f<n/2)
            return isPrime(n, f+1);
        return true;
    }

    void primeFactors()
    {
        System.out.println("\nPrime Factors of "+num+" are: ");
        for(int i=2; i<=num/2; i++)
            if(num%i==0 && isPrime(i, 2))  
                System.out.print(i+", ");
    }   

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number to generate its prime factors: ");
        int n= sc.nextInt();

        Factors obj= new Factors(n);
        obj.primeFactors();
    }
}