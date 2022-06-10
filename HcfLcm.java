import java.util.Scanner;
class HcfLcm
{
    private int n;

    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of integer to calculate Hcf and Lcm: ");
        n= sc.nextInt();
    }

    int hcf(int x, int y)
    {
        return x==0 ? y : hcf(y%x, x);
    }

    int lcm(int x, int y)
    {
        return (x*y)/hcf(x,y);
    } 

    void findhcflcm()
    {
        Scanner sc= new Scanner(System.in);
        int i, hcf=0, lcm=1, num;
        for(i=1; i<=n; i++)
        {
            System.out.print("Enter element #"+i+": ");
            num= sc.nextInt();
            hcf= hcf(hcf, num);
            lcm= lcm(num, lcm);
        }
        System.out.println("\nThe Hcf of the given numbers: "+hcf+
            "\nThe Lcm of the given numbers: "+lcm);
    }

    public static void main(String[] args)
    {
        HcfLcm obj= new HcfLcm();
        obj.input();
        obj.findhcflcm();
    }
}