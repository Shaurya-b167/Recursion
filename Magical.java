import java.util.Scanner;
class Magical
{
    private int limit;

    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit to generate magical numbers: ");
        limit= sc.nextInt();
    }

    int digitSum(int n) 
    {
        return n==0 ? 0 : n%10+digitSum(n/10);
    }

    boolean isMagical(int n)
    {
        while(n>9) 
            n=digitSum(n);
        return n==1? true: false;
    }

    void generate()
    {
        System.out.println("\nMagical numbers till "+limit+" are: ");
        for(int i=1; i<=limit; i++)
            System.out.print(isMagical(i)? i+", " : "");
    }

    public static void main(String[] args)
    {
        Magical obj= new Magical();
        obj.input();
        obj.generate();
    }
}