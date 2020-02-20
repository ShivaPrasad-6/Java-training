package Shape;

public class Square extends Shape{
	int side;
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public Square(int shapeId, String shapeName, int side) {
		super(shapeId, shapeName);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}
	int Area() {
		return side*side;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
