
package com.capgemini.shapedemo;

/**
 * @author Pooja Karnik Program to create a reference to Parent class and
 *         referring to any of the sub class and overriding a method
 *
 */
//creating a reference to Parent class and referring to any of the sub class and overriding a method
class ShapeDemo {

	// create a reference to Shape class and referring to any of the sub class and
	// overriding draw function
	public static void main(String[] args) {

		// Shape shape = new Polygon();
		// shape.draw();

		// creating an array of shape class and storing instances of the sub classes
		Shape shape[] = new Shape[3];
		shape[0] = new Circle();
		shape[1] = new Polygon();
		shape[2] = new Rectangle();

		shape[0].draw();
		shape[1].draw();
		shape[2].draw();

	}
}
