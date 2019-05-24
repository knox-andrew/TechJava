package com.techelevator;

public class Rectangle {
	
	private int height;
	private int width;
	
	
	
	public Rectangle() {
		height = 1;
		width = 1;		
		//System.out.println("Constructing a new Rectangle!");
	}
	
	public Rectangle(int width, int height) {
		this.setHeight(height);
		this.setWidth(width);
	}
	
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		if (height > 0) {
			this.height = height;
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getArea() {
		return width * height;
	}
	
	public boolean isLargerThan(Rectangle other) {		
		return (this.getArea() > other.getArea());
	}
	
	public boolean isLargerThan(int width, int height) {
		return (this.getArea() > (width * height));
	}
	
	@Override
	public String toString() {
		return getHeight() + "x" + getWidth() + " - " + getArea() + " square feet";
	}
	
	@Override
	public boolean equals(Object other) {
		boolean result = false;
		if (other != null && other instanceof Rectangle) {
			Rectangle otherRect = (Rectangle) other;
			result = (this.getWidth() == otherRect.getWidth() && this.getHeight() == otherRect.getHeight());			
		}
		return result;
	}
	

}
