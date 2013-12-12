package closure;

public class Shape {
	private String color;
	
	public Shape(String color){
		setColor(color);
	}
	
	public String toString(){
		return color;
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
}