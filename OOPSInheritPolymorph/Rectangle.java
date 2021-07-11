package OOPSInheritPolymorph;

public class Rectangle extends Quadrilateral
{
	Rectangle(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		setCoordinate(a,b,c,d,e,f,g,h);
	}
	int area()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
		return d1*d2;
	}

}
