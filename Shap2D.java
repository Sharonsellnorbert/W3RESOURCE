package JavaLab;

public class Shap2D {
		  public static void main(String[] args) {
		    Rectangle rectangle = new Rectangle();
		    Circle circle = new Circle();
		    rectangle.draw();
		    rectangle.resize();
		    circle.draw();
		    circle.resize();
		  }
}
abstract class Shape2D {
	  public abstract void draw();

	  public abstract void resize();
	}
class Rectangle extends Shape2D {
	  public void draw() {
	    System.out.println("Rectangle: Drawing a rectangle.");
	  }
	  public void resize() {
	    System.out.println("Rectangle: Resizing the rectangle.");
	  }
	}
class Circle extends Shape2D { 
	  public void draw() {
	    System.out.println("Circle: Drawing a circle.");
	  }
	  public void resize() {
	    System.out.println("Circle: Resizing the circle.");
	  }
	}

	

