import java.util.Scanner;
class NaturalSeries
{
    private int n;
    
    NaturalSeries(int nn)
    {
        n= nn;
    }
     
    int naturalSum(int n)
    {
        return n==1? 1 : n + naturalSum(n-1);
    }
    
    void seriesWithSum() 
    { 
        int sum=0, i, num;
        System.out.println("\nThe given series till "+n+" terms: ");
        for(i=1; i<=n; i++)
        {
            sum+= num= naturalSum(i);
            System.out.print(num+(i==n?"" :" + "));
        }
        System.out.println("\nThe sum of the given series: "+sum); 
    } 
    
    public static void main(String[] args)
    { 
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of terms in the given natural Cumulative Series: ");
        int n= sc.nextInt();
        
        NaturalSeries obj= new NaturalSeries(n);
        obj.seriesWithSum();
    }
}