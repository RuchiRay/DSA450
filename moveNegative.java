import java.util.Scanner;
class moveNegative
{
	public static void main (String[] args) {
	    Scanner kb  = new Scanner(System.in);
            System.out.println("enter array size");
		int n = kb.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i =0;i<n;i++)
		{
		   arr[i] = kb.nextInt(); 
		  }
		  int index = 0;
		  int temp = 0;
		for(int i = 0;i<n;i++)
		{
		    if(arr[i]<0)
		    {
		      temp = arr[index];
		      arr[index] = arr[i];
		      arr[i] = temp;
		      index++;
		  }
		  }
		  System.out.println(" array elements after moving negative");
		  for(int i = 0;i<n;i++)
		  {
		      System.out.println(arr[i]);
		  }
	}
}