package programs;

public class LargestNuminArray {

	public static void main(String[] args) 
	{
		int numbers[]= {1,2,3,0,4,5,6};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
				
		}
		System.out.println("largest num is::"+largest);
		System.out.println("Smallest num is::"+smallest);

	}

}
