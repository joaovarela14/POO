package aula07;

public class Circle extends Forma {
    double radius;
    
    public Circle(double radius, String cor) {
        this.radius = radius;
        this.cor = cor;
    }

	public void setRadius(double radius) {
		if (!validRadius(radius)) {
			throw new IllegalArgumentException("Radius cannot be negative.");
		}

		this.radius = radius;
	}

    public double getRadius(){
        return radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getName(){
        return "Circle";
    }
    

    private boolean validRadius(double radius) {
		return radius > 0;
	}
    
    @Override
    String cor() {
        return cor;
    }


    @Override
    public String toString() {
        return getName() + ": radius= " + radius + ", cor= " + cor + ", perimeter= " + getPerimeter() + ", area= " + getArea();
    }
}
    
