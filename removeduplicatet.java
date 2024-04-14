package basic_program;

import java.util.HashSet;

public class removeduplicatet {

	public static void main(String[] args) {
		int ar[]= {3,4,4,5,2,5,7,8};
		HashSet<Integer> hs = new HashSet<Integer>();
			for(int i=0;i<ar.length;i++)
			{
				hs.add(ar[i]);
			}
			for(int n : hs)
			{
				System.out.print(n+" ,");
			}
	}

}
