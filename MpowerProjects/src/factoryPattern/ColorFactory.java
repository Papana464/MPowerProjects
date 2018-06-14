package factoryPattern;

public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		if(color==null) {
			return null;
		}
		else if(color.equalsIgnoreCase("Red")){
			return new Red();
		}
		else if(color.equalsIgnoreCase("Green")) {
			return new Green();
		}
		else if(color.equalsIgnoreCase("Yellow")) {
			return new Yellow();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
