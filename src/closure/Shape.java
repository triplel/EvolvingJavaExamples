package closure;

public class Shape {
	private String color;
	private String shape;
	
	public Shape(String color){
		setColor(color);
		this.shape = "triangle";
	}
	
	public String toString(){
		return "A " + color + " " + shape;
	}
	
	public void setColor(String color){
		if(color!=null)
			this.color = color;
		else
			this.color = "WHITE";
	}
	
	public String getColor(){
		return color;
	}
	
	public void setShape(String shape){
		if(color!=null)
			this.shape = shape;
	}
	
	public String getShape(){
		return shape;
	}
}