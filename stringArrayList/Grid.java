package stringArrayList;

public class Grid {
	public static void main(String args[])
	{
		String[] str = new String[19];
		String[] tmp = new String[19];
		for(int i =0;i<19;i++)
		{
			if(i%2 == 0)
				str[i]="-";
			else
				str[i]=" ";
		}
		for(int i =0;i<19;i++)
		{
			tmp[i]=" ";
		}
		for(int i = 1;i<=9;i+=2)
		{
			for(int j = 1;j<=i;j+=2)
			{
				tmp[9-j]=str[9-j];
				tmp[9+j]=str[9+j];
			}
			for(int k=0;k<tmp.length;k++)
			{
				System.out.print(tmp[k]);
			}
			System.out.println(" ");
			System.out.println();
		}
		for(int i =0;i<19;i++)
		{
			tmp[i]=" ";
		}
		for(int i = 7;i>=1;i-=2)
		{
			for(int j = 1;j<=i;j+=2)
			{
				tmp[9-j]=str[9-j];
				tmp[9+j]=str[9+j];
			}
			for(int k=0;k<tmp.length;k++)
			{
				System.out.print(tmp[k]);
			}
			System.out.println(" ");
			System.out.println();
			for(int l =0;l<19;l++)
			{
				tmp[l]=" ";
			}
		}
	}

}
