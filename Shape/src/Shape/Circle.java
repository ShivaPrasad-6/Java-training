package Shape;

public class Circle extends Shape{
	final int pi= 3;
	int radius;
	

	@Override
	public String toString() {
		return "Circle [pi=" + pi + ", radius=" + radius + ", shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}


	public Circle(int shapeId, String shapeName, int radius) {
		super(shapeId, shapeName);
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}
	int Area() {
			return pi*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
