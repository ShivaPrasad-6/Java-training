package Shape;

public class Rectangle extends Shape {
	int length,breadth;

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", shapeId=" + shapeId + ", shapeName="
				+ shapeName + "]";
	}

	public Rectangle(int shapeId, String shapeName, int length, int breadth) {
		super(shapeId, shapeName);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	int Area() {
			return length*breadth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
