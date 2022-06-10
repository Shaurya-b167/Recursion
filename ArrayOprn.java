import java.util.Scanner;
class ArrayOprn
{
    private int arr[], n;
    
    ArrayOprn(int nn)
    {
        n= nn;
        arr= new int[n];
    }
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter element #"+(i+1)+": ");
            arr[i]= sc.nextInt(); 
        }
    }
    
    void display()
    {
        System.out.println("\nThe elements of the array are:");
        for(int i=0; i<n; i++)
            System.out.print(i==0? arr[i] : ", "+arr[i]);
        System.out.println("\nSum of all the elements: "+getSum(n-1)+
            "\nSmallest element in the array: "+getMin(n-1, arr[0]));
    }
    
    int getSum(int n)
    {
        return n==0? arr[n] : arr[n]+getSum(n-1);
    }
   
    int getMin(int n, int min)
    {
        if(n==0)
           return min;
        else
        {
            min= min<arr[n]? min : arr[n];
            return getMin(n-1, min);
        }
    } 
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of elements in an array: ");
        int n= sc.nextInt();
        
        ArrayOprn obj= new ArrayOprn(n);
        obj.input();
        obj.display();
    }
}