import java.net.PortUnreachableException;

//1. WAP to find the duplicates present in an array.

class DuplicateCheckInArray
{
	void dupCheck() 
	{
		int[] id = {1,2,3,3,4,3,5,2};

		for (int i =0; i<id.length; i++) 
		{
			for (int j = 0; j< id.length ; j++)
			{
				if (i == j)
				{
					continue;
				}
				else if (id[i] == id[j])
				{

					System.out.println("Duplicate value is " + id[i] + " at index of " + i ); 
					break;
				}
			}
			System.out.print("");
		}			
		System.out.println(" ");

	}
}

//2. WAP to sort an array using Quick Sort Algorithm.


class QuickSort{
	void qckSrt()
	{			//   3,10,22,24,34,56,98
		int [] qs = {98,56,34,3,24,22,10,45,102}; 
		System.out.print("Before quick sorting : ");
		for (int a : qs)
		{
			System.out.print(a + " ");

		}
		System.out.println(" ");

		for (int i=0; i<qs.length; i++)
		{

			for (int j=qs.length-1; j>=0 && j>i; j--)
			{
				//if (i<j)
				{
					if (qs[i] > qs[j])
					{
						int temp = qs[i];
						qs[i]= qs[j];
						qs[j]= temp;
					}
				}
			}
		}
		System.out.print("Sorted Using Quick Sort Method : ");

		for (int a : qs)
		{
			System.out.print(a + " ");

		}
		System.out.println(" ");
		System.out.println(" ");

	}
	
}


//3. WAP to sort an array using Bubble Sort Algorithm.

class BubbleSort 
{
	void bubSort() 
	{
		int [] bubar = {3,6,1,7,8,9,4,6,0};

		System.out.print("Unsorted order : ");

		for (int a : bubar)
		{
			System.out.print(a + " ");
		}
		System.out.println();

		for (int i =0; i<bubar.length; i++)
		{
			for (int j =1; j<bubar.length-i; j++)
			{	
				if (bubar[j-1] > bubar[j])
				{
					int temp = bubar[j-1] ;
					bubar [j-1] = bubar[j];
					bubar[j] = temp;
				}
			}
		}
		System.out.print("Sorted Using Bubble Sort Method : ");
		for (int a : bubar)
		{
			System.out.print(a + " ");

		}
		System.out.println("   ");
		System.out.println(" ");

	}

}


//4. WAP to sort an array using Merge Sort Algorithm.


class MergeSort{
	void merSort() {
		{
			int[] ms = {103,34,129,24,22,54,10,49,100,120,36,300,45,50,40,30,15}; 
			System.out.println("Before Merge Sort :  " );
			for (int a : ms)
			{
				System.out.print(a + " ");
			}
			int mid = ms.length /2;
			int[] leftAr1 = new int[mid];
			int[] rightAr1 = new int[ms.length - mid];

			for (int i=0; i<mid;i++)
			{
				leftAr1[i] = ms[i];
				//System.out.println(" ");

				//System.out.print(leftAr1[i] + " ");
			}
			for (int i=0; i<leftAr1.length;i++) 
			{
				for (int j=0; j<=leftAr1.length-1; j++)
				{
					if (leftAr1[i] < leftAr1[j])
					{
						int temp = leftAr1[i];
						leftAr1[i] = leftAr1[j];
						leftAr1[j] = temp;
					}
				}
			}
			//System.out.println();
			//System.out.println("  ");

			//System.out.println("This is sorted half array set 1 ");

//			for (int a : leftAr1)
//			{
//				System.out.print(a + " ");
//
//			}

//			System.out.println(" ");
//			System.out.println("  ");

			for (int i=mid; i<ms.length;i++)
			{
				rightAr1[i-mid] = ms[i];
				//System.out.print(rightAr1[i-mid] + " ");
			}
			//System.out.println(mid + " " + rightAr1.length);
			for (int i=0; i<rightAr1.length;i++) 
			{
				for (int j=0; j<=rightAr1.length-1; j++)
				{
					if (rightAr1[i] < rightAr1[j])
					{
						int temp = rightAr1[i];
						rightAr1[i] = rightAr1[j];
						rightAr1[j] = temp;
					}
				}
			}
			System.out.println(" " );
			System.out.println("  ");

			//System.out.println("This is sorted next half array set 2 ");

//			for (int a : rightAr1)
//			{
//				System.out.print(a + " ");
//
//			}
//			System.out.println("  ");
//			System.out.println("  ");


			int i =0;
			int j =0;
			int k = 0;
			int [] temp = new int [ms.length];
			while (k<temp.length-1) 
			{

				if (leftAr1[i] < rightAr1[j])
				{
					//System.out.println(i + " up " + j);
					temp[k] =  leftAr1[i];	


					k++;
					i++;
					if (k==temp.length-1 && rightAr1 [rightAr1.length-1] >= leftAr1 [leftAr1.length-1])
					{
						temp[k] = rightAr1[rightAr1.length-1];
					}



				}
				else if (rightAr1[j] <= leftAr1[i])
				{
					//System.out.println(i + "  low " + j);

					temp[k] =  rightAr1[j];	


					k++;
					j++;
					if (k==temp.length-1 && leftAr1 [leftAr1.length-1] >= rightAr1 [rightAr1.length-1])
					{
						temp[k] = leftAr1[leftAr1.length-1];
					}

				}

			}
			
			System.out.println("After Merge Sort : ");
			
			for (int a : temp)
			{
				System.out.print( a + " ");
			}
			System.out.println(" ");

		}
		System.out.println(" ");
		System.out.println(" ");


	}
}

//5. WAP to sort an array using Selection Sort Algorithm.

class SelSorted{
	void selSorted()
	{

		int [] ss = {30,20,14,5,3,20,10,2,1,100};
		//int [] out = new int [ss.length];
		int i=0;
		int temp = 0;
		int temp2 = 0;
		int temp3 = 0;
		
		System.out.print("Before Select sort : ");
		for (int a:ss)
		{
			System.out.print( a + " ");
		}
		
		
		for (int k =0; k<ss.length; k++)
		{	
			int sel = k;

			//System.out.println("Value of k" + k);
			for ( i =k; i<ss.length; i++)
			{


				//System.out.println("sel "+sel + " " + i + " " + ss[sel] + "  " +ss [i] );
				if (ss[sel] >= ss[i] )
				{	
					temp3 = ss[sel];
					temp = ss[i];

					//System.out.println( temp + " " +sel);
					temp2 = i;

					ss[sel] = temp;
					ss[i] = temp3;
					//System.out.println("value of temp : " +temp);
				}				
			}


			int temp1 = ss[k];
			ss[k] = temp;
		}
		System.out.println(" ");
		System.out.println(" ");

		System.out.print("After selected sort method :  ");

		for (int a:ss)
		{
			System.out.print( a + " ");
		}
		System.out.println();
	}
}


//6. WAP to check whether an array is a subset of another array.

class ArraySubs {

	void arraysubs() 
	{

		int [] arr1 = {1,2,9,3,6,7,5};
		int [] arr2 = {5,7,2,9};
		int [] temp = new int[arr2.length];
		String temp1 = "This is the sub set of array";

		for (int i=0; i<arr2.length; i++)
		{
			for (int j=0; j<arr1.length; j++)
			{
				if (arr2[i] == arr1[j])
				{
					temp[i] = arr2[i];
				}	
			}
		}
		for(int l=0; l<temp.length ;l++ )
		{
			if (arr2[l] != temp[l]) 
			{
				temp1 = "This is not the sub set of array";
				break;
			}
		}
		System.out.println();

		System.out.println("Main Array : ");
		for (int a1 : arr1)
		{
			System.out.print(a1 + " ");
		}
		System.out.println();
		
		System.out.println("Array input (arr2) for subset check : ");
		for (int a1 : arr2)
		{
			System.out.print(a1 + " ");
		}
		System.out.println( );
		
		System.out.println("Answer is :  " + temp1);
	}
}

public class InueronAssignment2 {

	public static void main(String[] args) 
	{
		System.out.println("QUESTION : 1 ");

		DuplicateCheckInArray dc = new DuplicateCheckInArray();
		dc.dupCheck();

		System.out.println("QUESTION : 2 ");

		QuickSort qss = new QuickSort();
		qss.qckSrt();

		System.out.println("QUESTION : 3 ");

		BubbleSort bs = new BubbleSort();
		bs.bubSort();

		System.out.println("QUESTION : 4 ");

		MergeSort msa = new MergeSort();
		msa.merSort();
	
		System.out.println("QUESTION : 5 ");

		SelSorted se = new SelSorted();
		se.selSorted();
		
		System.out.println();
		System.out.println("QUESTION : 6 ");

		ArraySubs ars = new ArraySubs();
		ars.arraysubs();




	}
}
