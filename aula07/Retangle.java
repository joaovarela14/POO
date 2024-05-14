package aula07;

public class Retangle extends Forma {
    double width;
    double height;
    
    public Retangle(double width, double height, String cor) {
        this.width = width;
        this.height = height;
        this.cor = cor;
    }

    public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	public void setWidth(double width) {
		if (!validWidth(width)) {
			throw new IllegalArgumentException("Width cannot be negative.");
		}

		this.width = width;
	}

	public void setHeight(double height) {
		if (!validHeight(height)) {
			throw new IllegalArgumentException("Height cannot be negative.");
		}

		this.height = height;
	}

    public String getName(){
        return "Retangle";
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
    
    
    private boolean validWidth(double width) {
		return width >= 0;
	}

	private boolean validHeight(double height) {
		return height >= 0;
	}

    @Override
    String cor() {
        return cor;
    }

    @Override
    public String toString() {
        return getName()+": height= " + height + ", width= " + width + ", cor= " + cor + ", perimeter= " + getPerimeter() + ", area= " + getArea();
    }

}
    

