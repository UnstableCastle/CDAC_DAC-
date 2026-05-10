public class NestedForDemo {	
	public static void main(String[] args) {		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if((i==2) && (j==2))
				{
					//break;
					continue;
				}
				System.out.println(i+" "+j);
			}
			System.out.println();	
			}
		}
	}
/*
for(init;condition;inc/dec) //OuterLoop
{
	for(init;condition;inc/dec)//Inner Loop
	{
	//stmts;
	}
}
//....
*/
