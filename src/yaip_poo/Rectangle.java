package yaip_poo;

public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	
	public Rectangle(float newLength, float newWidth) {
		this.length = newLength;
		this.width = newWidth;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float newLength) {
		this.length = newLength;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float newWidth) {
		this.width = newWidth;
	}
	
	public float getArea() {
		return this.width*this.length;
	}
	
	public float getPerimeter() {
		return this.width*2+this.length*2;
	}
	
	public String toString() {
		return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
	}
}
