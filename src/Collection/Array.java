package Collection;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =0;
		int ar[]= new int[5];
		
		ar[0]=10;
		ar[1]=15;
		ar[2]=20;
		ar[3]=25;
		ar[4]=30;
		/*ar[5]=40;
		ar[6]=50;*/
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		while(j <ar.length)
		{
			System.out.println(ar[j]);
			j++;
		}
		
		int a[]= {0,1,2,3,4,5,6,7};
		
		
		for (int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}

		
		
	}

}
