import java.util.Scanner;
class InsertionSort
{
    private float arr[];
    private int n;
    
    InsertionSort(int n)
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
    
    void insertionSort(int n)
    {
        if(n==this.n)
           return;
        int i= n-1; 
        float current= arr[n];
        while(i>=0 && arr[i]>current)
        {
            arr[i+1]= arr[i];
            i--;
        }
        arr[i+1]= current;
        insertionSort(n+1);
    }     
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of integers to be stored in the array: ");
        int n= sc.nextInt();
        
        InsertionSort obj= new InsertionSort(n);
        
        obj.input();
        System.out.println("\nThe elements of the array before sorting: ");
        obj.display();
        
        obj.insertionSort(0);
        System.out.println("\nThe elements of the array after sorting: ");
        obj.display();
    }
}