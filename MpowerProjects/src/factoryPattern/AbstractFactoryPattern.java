package factoryPattern;

public class AbstractFactoryPattern {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape =shapeFactory.getShape("Rectangle");
		shape.draw();
		shape = shapeFactory.getShape("Square");
		shape.draw();
		shape = shapeFactory.getShape("Triangle");
		shape.draw();
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color =colorFactory.getColor("Red");
		color.fill();
		color = colorFactory.getColor("yellow");
		color.fill();
		color = colorFactory.getColor("green");
		color.fill();
	}
}
