import java.util.Scanner;
class LinearSearch
{
    private int arr[], n;
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of all elements to be entered: ");
        n= sc.nextInt();
        arr= new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter element #"+(i+1)+": ");
            arr[i]= sc.nextInt();
        }
    }

    void display()
    {
        for(int i=0; i<n; i++)
            System.out.print(i==0? arr[i] : ", "+arr[i]);
        System.out.println();
    }
    
    int linearSearch(int ele, int n)
    {
        if(n==this.n)
           return -1;
        else if(ele==arr[n])
           return n;
        return linearSearch(ele, n+1);  
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        LinearSearch obj= new LinearSearch();
        obj.input();
        System.out.println("\nThe elements of the array as entered: ");
        obj.display();
        
        System.out.print("\nEnter the element to search in the array: ");
        int ele= sc.nextInt();
        int pos= obj.linearSearch(ele, 0);
        if(pos==-1)
           System.out.println("\nThe element entered is not present in the array!");
        else
           System.out.println("\nThe element "+ele+" is found in the array at position "+(pos+1)+"!");
    }
}