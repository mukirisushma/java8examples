package matrix.programs;
 import  java.util.*;
 

import java.util.Scanner;

public class identMatrix {
	public static void main(String args[]) {
		
		int a[][]= new int[3][3],i,j,f=0;
		
	   System.out.println("Enter the matrix elements");	
	   Scanner sc= new Scanner(System.in);
	   for (i=0;i<3;i++)
	   {
		   for(j=0;j<3;j++)
		   {
			 System.out.println("Enter the Number pocket[" + i+ "]["+j+"] ") ;  
			 a[i][j] = sc.nextInt();
		   }
	   }
	   System.out.println("Entered Matrix.....");
	   for(i=0;i<3;i++)
	   { 
		   for(j=0;j<3;j++) 
		   	{
			   System.out.println(a[i][j]+" ");
	       }
		   System.out.println();
	   }
	   for (i=0;i<3;i++)
	   {
		   for(j=0;j<3;j++) {
			    if(i==j&& a[i][j]!=1)
			    {
			    	f=1;
			    	break;
			    }else if(i!=j && a[i][j]!=0)
			    {
			    	f=1;
			    	break;
			    }
		   }
	   }
	   if(f==0)
		   System.out.println("Entered matrix is the Identity matrix");
	   else
		   System.out.println("Entered matrix is not Identical");
	}
	

}
