package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {9,7,5,3,2,4,6,8,1};
     
     for(int i=0;i<arr.length;i++)
     {
    	 int t=arr[i],j;
    	 for(j=i; j>0 && arr[j-1]>t ; j--)
    	 {
    		 arr[j]=arr[j-1];
    	 }
    	 
    	 arr[j]=t;
     }
     
     for(int i=0;i<arr.length;i++)
     {
     System.out.print(arr[i]+" ");
     }
		
		
	}

}
