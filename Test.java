import java.util.Scanner;
class Test
{
    private int num;
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to check whether its divisible by 11 or not: ");
        num= sc.nextInt();
    } 
     
    void display()
    {
        System.out.println(num +" is "+(isDivBy11()? "": "not ")+"divisible by 11!");
    }
    
    int remainder(int num, int den)
    {
        return num<den ? num : remainder(num-den, den);
    } 
     
    boolean isDivBy11()
    {
        return remainder(num, 11)==0? true : false;
    }
    
    public static void main(String[] args)
    {
        Test obj= new Test();
        obj.input();
        obj.display();
    }
}