package oopsMiscellaneous;

import java.io.Serializable;

public class SerializableClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2756759296954125845L;

	public SerializableClass(double height, double width) {
		// TODO Auto-generated constructor stub
		this.rectHeight = height;
		this.rectWidth =width;
		
	}

	private double rectHeight;
	private double rectWidth;
	
	public double Area() {
		return rectHeight * rectWidth;
	}
	
	public double perimeter() {
		return 2*(rectHeight+rectWidth);
	}
	
}
