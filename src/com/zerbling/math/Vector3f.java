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
	
	public Vector3f rotate() {
		return null;
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
