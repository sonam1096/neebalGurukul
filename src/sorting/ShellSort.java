package sorting;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int arr[]= {19,3,16,18,2,17,4,11,5};
		int i,j,t,g;
		
		for(g=arr.length;g>=1;g=g/2)
		{
			for(i=g; i<arr.length;i++)
			{
				t=arr[i];
				for(j=i; j>=g&& arr[j-g]>t ;j=j-g)
				{
					arr[j]=arr[j-g];
				}
				arr[j]=t;
			}
		}
		for( i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
