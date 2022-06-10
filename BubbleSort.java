import java.util.Scanner;
class BubbleSort
{
    private float arr[];
    private int n;
    
    BubbleSort(int n)
    {
        this.n= n;
        arr= new float[n];
    }
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter number for Element #"+(i+1)+": ");
            arr[i]= sc.nextFloat();
        }
    }
    
    void display()
    {
        for(int i=0; i<n; i++)
             System.out.print(i==0? arr[i] : ", "+arr[i]);
        System.out.println();
    }
    
    void bubbleSort(int n)
    {
        if(n==1)
           return;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                float swap= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= swap;
            }
        }
        bubbleSort(n-1);
    } 
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of integers to be stored in the array: ");
        int n= sc.nextInt();
        
        BubbleSort obj= new BubbleSort(n);
        obj.input();
        
        System.out.println("\nThe elements of the array before sorting: ");
        obj.display();
        
        obj.bubbleSort(n);
        System.out.println("\nThe elements of the array after sorting: ");
        obj.display();
    }
}