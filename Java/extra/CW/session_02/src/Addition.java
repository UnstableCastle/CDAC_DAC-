
public class Addition {
	/*
	public void add(int a,int b)
	{
		System.out.println("Sum = "+(a+b));
	}
	
	public float add(int a,float b)
	{
		float s = a+b;
		return s;
	}
	
	public int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	*/
	
	public int add(int b, int... a)
	{
		int sum = 0;
		System.out.println("Length = "+a.length);
		/*for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}*/
		for(int i:a)//forEach
		{
			sum+=i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Addition a =new Addition();
		//System.out.println("Total = "+a.add(10, 10.2f));
		System.out.println(a.add(10,20));
		System.out.println(a.add(1,2,3,4,5));
		System.out.println(a.add(1,2,3));
	}
}

//VarArgs - ... 
//for-Each(Enhanced For Loop)
/*
 * for(dataType var:Array/Collection) { }
 */











