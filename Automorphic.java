import java.util.Scanner;
class Automorphic
{
    private int limit;
    
    Automorphic(int lim)
    {
        limit= lim;
    }
    
    int digitCount(int nt)
    {
        return nt==0?  0 : 1+digitCount(nt/10);
    }
    
    boolean isAutomorphic(int num)
    {
        return (num*num)%(int)Math.pow(10, digitCount(num))==num ? true : false;
    } 
    
    void generate()
    {
        System.out.println("\nThe Automorphic numbers till "+limit+": ");
        for(int i=1; i<=limit; i++)
           System.out.print(isAutomorphic(i)? i+", ": "");
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit to generate Automorphic numbers: ");
        int lim= sc.nextInt();
        
        Automorphic obj= new Automorphic(lim);
        obj.generate();
    }
}