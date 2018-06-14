package factoryPattern;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if(shape==null) {
			return null;
		}
		else if(shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		else if(shape.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		return null;
		
	}

}
