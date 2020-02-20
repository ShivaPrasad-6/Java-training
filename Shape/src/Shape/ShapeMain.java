package Shape;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape(1,"rectangle");
		System.out.println(""+s.shapeId +""+s.shapeName);
		Shape p=new Shape(2,"circle");
		System.out.println(""+p.shapeId +""+p.shapeName);
		Rectangle r=new Rectangle(1,"rectangle",8,4);
		System.out.println(r.Area());
		Circle c=new Circle(2,"circle",6);
		System.out.println(c.Area());
		Square m=new Square(3,"square",4);
		System.out.println(m.Area());
	}
}
