package ObjectClass;

public class InterfaceShapesImpl implements InterfaceShapes {
	
	@Override
	public void AreaOfSquare(int side) {
		int Area = 4 * side;
		System.out.println(Area);
	};
	
	@Override
	public void AreaOfCircle(int rad) {
		double CircleArea= pi *( rad* rad);
		System.out.println(CircleArea);
	}
}
