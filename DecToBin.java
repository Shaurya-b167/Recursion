import java.util.Scanner;
class DecToBin
{
    private int num;

    DecToBin()
    {
        num=0;
    }

    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number in decimal system to find its value in binary system: ");
        num= sc.nextInt();
    }
   
    void convert(int no)
    {
        if(no==0)
            return;
        else
        {
            convert(no/2);
            System.out.print(no%2);
        }  
    }

    void display() 
    {
        System.out.print("\n"+num+" (Decimal) = ");
        convert(num);
        System.out.print(" (Binary)");
    }

    public static void main(String[] args)
    {
        DecToBin obj= new DecToBin();
        obj.input();
        obj.display();
    }
}