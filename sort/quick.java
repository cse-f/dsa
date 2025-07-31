import java.util.*;


public class quick
{  static int[] a=new int[]{45,324,65,23,56,8,5,3,67};
	public static void main (String[] args) throws java.lang.Exception
	{
		 
	      quicksort(0, a.length-1);
				System.out.println(Arrays.toString(a));
  
		}
		public static void quicksort(int low,int high){
        if(low>=high)return;
        int p=sort(low,high);
				quicksort(low, p-1);
				quicksort(p+1, high);
				
			
				




		}
		public static int sort(int low,int high){
					int pivot=low;
					int i=low,j=high;
					// System.out.println(Arrays.toString(a));
					while(i<j){
              while(i<=high && a[i]<=a[pivot]){

								i++;
							}
							while(j>=low && a[j]>a[pivot]){
								j--;
							}

							if(i<j){
								int temp=a[i];
								a[i]=a[j];
								a[j]=temp;
							}

					}

					int temp=a[low];
								a[low]=a[j];
								a[j]=temp;
					


      // System.out.println(Arrays.toString(a));
      return j;

		}
	}
	



		
		


  




