package arrayProblem;

import java.util.Arrays;
import java.util.Scanner;

class Merge2Sorted {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int T = Integer.parseInt(sc.nextLine().trim());
		
		while(T-->0) {
			
			String str[] = sc.nextLine().trim().split(" ");
			
			
			int arrOneSize = Integer.parseInt(str[0]);
			int arrTwoSize = Integer.parseInt(str[1]);

			int[] A = new int[arrOneSize];
			int[] B = new int[arrTwoSize];
			
			
			String temp1[] = sc.nextLine().trim().split(" ");
			
			for(int q=0; q<arrOneSize; q++)
				A[q]=Integer.parseInt(temp1[q]);

			String temp2[] = sc.nextLine().trim().split(" ");

			for(int p=0; p<arrTwoSize; p++)
				B[p]=Integer.parseInt(temp2[p]);

			int[] mergedArray = new int[arrOneSize+arrTwoSize];
				
			int i=0,j=0,k=0;
			
			while(i<arrOneSize && j<arrTwoSize) {
				
				if(A[i]>=B[j]) {
					
					mergedArray[k] =B[j];
					j++;
				}
					else
					{
						mergedArray[k]=A[i];
						i++;
					}
						
				k++;
				
			}
			
			if(i<arrOneSize) {
				for(int h=i;h<arrOneSize;h++)
				mergedArray[k]=A[h];
				k++;
			}
			else {
				for(int d=j;d<arrTwoSize;d++)
					mergedArray[k]=B[d];
					k++;
				
			}
			

			for(int z=0;z<mergedArray.length;z++)
				System.out.print(mergedArray[z] + " ");
			
		}
	
		
	}
}