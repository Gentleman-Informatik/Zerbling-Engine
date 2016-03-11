/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/ or send a letter to Creative Commons,
 * 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
 * 
 * @author Flavio Kleiber <zerbarian@gmail.com>
 * @desc Simple Vector3f class
 */

package com.zerbling.math;

public class Vector3f {

	private float x;
	private float y;
	private float z;
	
	/**
	 * Constructor
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public Vector3f(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Returns the length of the vector
	 * 
	 * @return float
	 */
	public float length() {
		return (float)Math.sqrt(this.x * this.x + this.y * this.y * this.z * this.z);
	}
	
	/**
	 * 
	 * 
	 * @param v
	 * @return float
	 */
	public float dot(Vector3f v) {
		return this.x * v.getX() + this.y + v.getY() + this.z * v.getZ();
	}
	
	/**
	 * This method will normalize a vector
	 * 
	 * @return vector2f
	 */
	public Vector3f normalize() {
		
		float length = this.length();
		this.x /= length;
		this.y /= length;
		this.z /= length;
		
		return this;
		
	}
	
	/**
	 * Returns the cross product of a vec3
	 * 
	 * @param v
	 * @return vector3f
	 */
	public Vector3f cross(Vector3f v) {
		
		float x = this.y * v.getZ() - this.z * v.getY();
		float y = this.z * v.getX() - this.x * v.getZ();
		float z = this.x * v.getY() - this.y * v.getX();
		
		return new Vector3f(x, y, z); 
		
	}
	
	public Vector3f rotate() {
		return null;
	}
	
	/**
	 * Adds to vectors
	 * 
	 * @param v
	 * @return vector3f
	 */
	public Vector3f add(Vector3f v) {
		return new Vector3f(this.x + v.getX(), this.y + v.getY(), this.z + v.getZ());
	}
	
	/**
	 * Adds to vectors by a single float
	 * 
	 * @param v
	 * @return vector3f
	 */
	public Vector3f add(float v) {
		return new Vector3f(this.x + v, this.y + v, this.z + v);
	}
	
	/**
	 * Subtracts to vectors
	 * 
	 * @param v
	 * @return vector3f
	 */
	public Vector3f sub(Vector3f v) {
		return new Vector3f(this.x - v.getX(), this.y - v.getY(), this.z - v.getZ());
	}
	
	/**
	 * Subtracts to vectors by a single float
	 * 
	 * @param v
	 * @return vector3f
	 */
	public Vector3f sub(float v) {
		return new Vector3f(this.x - v, this.y - v, this.z - v);
	}
	
	/**
	 * Divides to vectors
	 * 
	 * @param v
	 * @return vector3f
	 */
	public Vector3f div(Vector3f v) {
		return new Vector3f(this.x / v.getX(), this.y / v.getY(), this.z / v.getZ());
	}
	
	/**
	 * Divides to vectors by a single float
	 * 
	 * @param v
	 * @return vector3f
	 */
	public Vector3f div(float v) {
		return new Vector3f(this.x / v, this.y / v, this.z / v);
	}
	
	/**
	 * Multiplies to vectors
	 * 
	 * @param v
	 * @return vector3f
	 */
	public Vector3f multi(Vector3f v) {
		return new Vector3f(this.x * v.getX(), this.y * v.getY(), this.z * v.getZ());
	}
	
	/**
	 * Multiplies to vectors by a single float
	 * 
	 * @param v
	 * @return vector3f
	 */
	public Vector3f multi(float v) {
		return new Vector3f(this.x * v, this.y * v, this.z * v);
	}
	
	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * @return the z
	 */
	public float getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(float z) {
		this.z = z;
	}
	
	
	
	
}
