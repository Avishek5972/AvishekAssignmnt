package OOPSInheritPolymorph;

public class Parralellogram extends Quadrilateral{
	private int height;
	Parralellogram(int a,int b,int c,int d,int e,int f,int g,int h,int height)
	{
		setCoordinate(a,b,c,d,e,f,g,h);
		this.height=height;
	}
	int area()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d1*height;
	}

}
