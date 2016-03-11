/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/ or send a letter to Creative Commons,
 * 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
 * 
 * @author Flavio Kleiber <zerbarian@gmail.com>
 * @desc Simple Vector2f class
 */

package com.zerbling.math;

public class Vector2f {
	
	private float x;
	private float y;
	
	/**
	 * Constructor
	 * 
	 * @param x
	 * @param y
	 */
	public Vector2f(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Returns the length of the vector
	 * 
	 * @return float
	 */
	public float length() {
		return (float)Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	/**
	 * 
	 * 
	 * @param v
	 * @return float
	 */
	public float dot(Vector2f v) {
		return this.x * v.getX() + this.y + v.getY();
	}
	
	/**
	 * This method will normalize a vector
	 * 
	 * @return vector2f
	 */
	public Vector2f normalize() {
		
		float length = this.length();
		this.x /= length;
		this.y /= length;
		
		return this;
		
	}
	
	/**
	 * Rotates a vector by given angel
	 * 
	 * @param angle
	 * @return vector2f
	 */
	public Vector2f rotate(float angle) {
		
		double rad = Math.toRadians(angle);
		double cos = Math.cos(rad);
		double sin = Math.sin(rad);
		
		return new Vector2f((float)(x * cos - y * sin), (float)(x * sin + y * cos));
		
	}
	
	/**
	 * Adds to vectors
	 * 
	 * @param v
	 * @return vector2f
	 */
	public Vector2f add(Vector2f v) {
		return new Vector2f(this.x + v.getX(), this.y + v.getY());
	}
	
	/**
	 * Adds to vectors by a single float
	 * 
	 * @param v
	 * @return vector2f
	 */
	public Vector2f add(float v) {
		return new Vector2f(this.x + v, this.y + v);
	}
	
	/**
	 * Subs the current vector from a other vector
	 * 
	 * @param v
	 * @return vector2f
	 */
	public Vector2f sub(Vector2f v) {
		return new Vector2f(this.x - v.getX(), this.y - v.getY());
	}
	
	/**
	 * Subs the current vector from a single float
	 * 
	 * @param v
	 * @return vector2f
	 */
	public Vector2f sub(float v) {
		return new Vector2f(this.x - v, this.y - v);
	}
	
	/**
	 * Divides the current vector from a other vector
	 * 
	 * @param v
	 * @return vector2f
	 */
	public Vector2f div(Vector2f v) {
		return new Vector2f(this.x / v.getX(), this.y / v.getY());
	}
	
	/**
	 * Divides the current vector from a single float
	 * 
	 * @param v
	 * @return vector2f
	 */
	public Vector2f div(float v) {
		return new Vector2f(this.x / v, this.y / v);
	}
	
	/**
	 * Multiplies the current vector from a other vector
	 * 
	 * @param v
	 * @return vector2f
	 */
	public Vector2f multi(Vector2f v) {
		return new Vector2f(this.x * v.getX(), this.y * v.getY());
	}
	
	/**
	 * Multiplies the current vector from a single float
	 * 
	 * @param v
	 * @return vector2f
	 */
	public Vector2f multi(float v) {
		return new Vector2f(this.x * v, this.y * v);
	}
	
	
	/**
	 * A simple toString method for debug
	 * 
	 * @return String
	 */
	public String toString() {
		return "(" + this.x + " , " + this.y + ")";
	}
	
	/**
	 * Getter for x
	 * 
	 * @return float
	 */
	public float getX() {
		return x;
	}
	
	/**
	 * Setter for x
	 * 
	 * @param x
	 * @return void
	 */
	public void setX(float x) {
		this.x = x;
	}
	
	/**
	 * Getter for y
	 * 
	 * @return float
	 */
	public float getY() {
		return y;
	}
	
	/**
	 * Setter for Y
	 * 
	 * @param y
	 * @return void
	 */
	public void setY(float y) {
		this.y = y;
	}
	
}
