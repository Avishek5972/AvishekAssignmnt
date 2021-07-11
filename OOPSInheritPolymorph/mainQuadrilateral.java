package OOPSInheritPolymorph;

public class mainQuadrilateral {

	public static void main(String[] args) {
		Square sq=new Square(100,100,200,100,200,200,100,200);
		System.out.println("Area Of The Square is " + sq.area());
		Rectangle rec=new Rectangle(1,1,3,1,3,2,1,2);
		System.out.println("Area Of The Rectangle is " + rec.area());
		Parralellogram p=new Parralellogram(5,5,15,5,10,10,0,10,4);
		System.out.println("Area Of The Parallelogram is " + p.area());
		Trapezoid t=new Trapezoid(20,20,60,20,80,40,0,40,16);
		System.out.println("Area Of The Trapezoid is " + t.area());

	}

}
