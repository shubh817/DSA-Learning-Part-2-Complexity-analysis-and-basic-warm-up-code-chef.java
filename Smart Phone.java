/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner sc = new Scanner(System.in);
        	int t=sc.nextInt();
        	long a[]=new long[t];
        	for(int i=0;i<t;i++)
        	{
        	    a[i]=sc.nextInt();
        	}
        	Arrays.sort(a);
        	int count=t;
        	long b[]=new long[t];
        	for(int i=0;i<t;i++)
        	{
        	    b[i]=a[i]*count;
        	    count--;
        	}
        	Arrays.sort(b);
        	System.out.println(b[b.length-1]);
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
