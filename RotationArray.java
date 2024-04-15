package basic_program;
import java.util.Scanner;
public class RotationArray {
	static void rotation(int a[])
	{
		int temp=a[0];
		for(int i=1;i<a.length;i++)
		{	a[i-1]=a[i];
		}
		a[a.length-1]=temp;
	}
	static void rotate(int a[],int k)
	{		
		for(int i=1;i<=k;i++)
		{
			rotation(a);
		}		
	}
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);		
		System.out.println("enter how many elements you want to rotate ");
		int k = sc.nextInt();		
		for(int i=0; i<=a.length-1;i++)
		{			 
			System.out.print(" "+a [i]);
		}
		System.out.println();
         rotate(a, k);
         for(int i=0;i<a.length;i++)
         {
        	 System.out.print(" "+a[i]);
         }           
	}
	}
