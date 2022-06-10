import java.util.Scanner;
class SortOrder
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

    int sortOrder(int x, int y, int start)
    {
        if(start==n-1)
            return (x>0 && y==0)? 1 : (y>0 && x==0)? 2 : 0;
        if(arr[start] < arr[start+1])
            x++;
        else
            y++;
        return sortOrder(x, y, start+1);
    } 

    public static void main(String[] args)
    {
        SortOrder obj= new SortOrder();
        obj.input();
        
        System.out.println("\nThe elements of the array are:");
        obj.display();
        System.out.println("\nThe elements are "+(obj.sortOrder(0, 0, 0)==1? "arranged in ascending order!": 
                obj.sortOrder(0, 0, 0)==2? "arranged in descending order!" : "not sorted!"));
    }
}