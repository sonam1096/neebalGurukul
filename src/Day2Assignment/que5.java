package Day2Assignment;

public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		int t=0;
		int count=10;
		 for(int i=1;i<=count;i++) {
			// System.out.println("number");
			  t=f+s;
			 f=s;
			 s=t;
			 if(t%2==0) 
				 System.out.print(t+" ");
		 }
					

	}

}
