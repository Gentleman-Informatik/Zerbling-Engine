/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/ or send a letter to Creative Commons,
 * 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
 * 
 * @author Flavio Kleiber <zerbarian@gmail.com>
 * @desc Class to represent a matrix
 */

package com.zerbling.math;

public class Matrix4f {
	
	private float[][] matrix;
	
	/**
	 * Constructor
	 * 
	 * @return void
	 */
	public Matrix4f() {
		
		//Init matrix
		this.matrix = new float[4][4];
	}

	/**
	 * @return the matrix
	 */
	public float[][] getMatrix() {
		return matrix;
	}
	
	/**
	 * This will return values from specific cords
	 * 
	 * @param x
	 * @param y
	 * @return float
	 */
	public float get(int x, int y) {
		return this.matrix[x][y];
	}
	
	/**
	 * This will set a value to a specific cord
	 * 
	 * @param x
	 * @param y
	 * @param value
	 * @return float
	 */
	public void set(int x, int y, float value) {
		this.matrix[x][y] = value;
	}

	/**
	 * @param matrix the matrix to set
	 */
	public void setMatrix(float[][] matrix) {
		this.matrix = matrix;
	}
	
}
