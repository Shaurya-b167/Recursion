import java.util.Scanner;
class BinarySearch
{
    protected int arr[], n;

    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of all elements to be entered: ");
        n= sc.nextInt();
        
        arr= new int[n];
        
        System.out.println("\nEnter "+n+" elements in ASCENDING ORDER:");
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

    int binarySearch(int ele, int p, int q)
    {
        int mid= (p+q)/2; 
        if(p > q)
            return -1;
        else if(arr[mid] == ele)
            return mid;
        else 
        {
            p = arr[mid] < ele ? mid+1 : mid-1;          
            return binarySearch(ele, p, q);
        }
    }  

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        BinarySearch obj= new BinarySearch();

        obj.input();

        System.out.println("\nThe elements of the array as entered: ");
        obj.display();

        System.out.print("\nEnter the element to search in the array: ");
        int ele= sc.nextInt();
        
        int pos= obj.binarySearch(ele, 0, obj.n-1);
        if(pos==-1)
            System.out.println("\nThe element entered is not present in the array!");
        else
            System.out.println("\nThe element "+ele+" is found in the array at position "+(pos+1)+"!");
    }
}