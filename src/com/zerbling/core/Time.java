/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/ or send a letter to Creative Commons,
 * 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
 * 
 * @author Flavio Kleiber <zerbarian@gmail.com>
 * @desc Time class with some nice little methods 
 */

package com.zerbling.core;

public class Time {
	
	/**
	 * Const for second
	 */
	public static final long SECOND = 1000000000L;
	
	//Delta var
	private static double delta;
	
	/**
	 * This method returns the system nanoTime
	 * 
	 * @return nanoTime
	 */
	public static long getTime() {
		return System.nanoTime();
	}
	
	/**
	 * Get delta 
	 * 
	 * @return delta
	 */
	public static double getDelta() {
		return delta;
	}
	
	/**
	 * Set delta
	 * 
	 * @param delta
	 * @return void
	 */
	public static void setDelta(double delta) {
		Time.delta = delta;
	}
	
	
	
}
