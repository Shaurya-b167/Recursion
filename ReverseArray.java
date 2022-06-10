import java.util.Scanner;
class ReverseArray
{
    private int arr[], n;
    
    ReverseArray(int nn)
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
    
    void showElements(int start)
    {
        if(start==n)
           return;
        else
        {
            System.out.print(start==0? arr[start] : ", "+arr[start]);
            showElements(start+1);
        }
    }
     
    void reverseElements(int start)
    {
        if(start==n/2)
           return;
        else 
        {
            int swap= arr[start];
            arr[start]= arr[n-start-1];
            arr[n-start-1]= swap;
            reverseElements(start+1);
        } 
    } 
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of elements to be stored in the array: ");
        int n= sc.nextInt();
        
        ReverseArray obj= new ReverseArray(n);
        obj.input();
        System.out.println("\nThe elements of the array as entered: ");
        obj.showElements(0);
        System.out.println("\n\nThe elements of the array in reverse order: ");
        obj.reverseElements(0);
        obj.showElements(0);
    }
}