package OOP;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		for(int i =1;i<=500;i++)
		{
			for(int j =i;j<=500;j++)
			{
				double thrdsde=Math.sqrt((i*i)+(j*j));
				if(thrdsde>500.0)
					continue;
				if(Math.floor(thrdsde)==thrdsde)
					System.out.println(i+"\t"+j+"\t"+thrdsde);
			}
		}

	}

}
