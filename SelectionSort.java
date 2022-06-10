import java.util.Scanner;
class SelectionSort
{
    private float arr[];
    private int n;
    
    SelectionSort(int n)
    {
        this.n= n;
        arr= new float[n];
    }
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter element #"+(i+1)+": ");
            arr[i]= sc.nextFloat();
        }
    }
    
    void display()
    {
        for(int i=0; i<n; i++)
             System.out.print(i==0 ? arr[i] : ", "+arr[i]);
        System.out.println();
    }
    
    void selectionSort(int n)
    {
        int minIndex= n;
        if(n==this.n-1)
           return;
        for(int i=n+1; i<this.n; i++)
           if(arr[i] < arr[minIndex])
              minIndex= i;
        float swap= arr[n];
        arr[n]= arr[minIndex];
        arr[minIndex]= swap;
        selectionSort(n+1);
    }  
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of integers to be stored in the array: ");
        int n= sc.nextInt();
        
        SelectionSort obj= new SelectionSort(n);
        
        obj.input();
        System.out.println("\nThe elements of the array before sorting: ");
        obj.display();
        
        obj.selectionSort(0);
        System.out.println("\nThe elements of the array after sorting: ");
        obj.display();
    }
}