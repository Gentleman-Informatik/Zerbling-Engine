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
