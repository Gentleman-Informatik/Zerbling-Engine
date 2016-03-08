/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/ or send a letter to Creative Commons,
 * 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
 * 
 * @author Flavio Kleiber <zerbarian@gmail.com>
 * @desc This class is the basic window class 
 */

package com.zerbling.core;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.PixelFormat;

public class Window {
	
	/**
	 * FPS CAP
	 */
	private static final int FPS_CAP = 120;
	
	/**
	 * Create a basic window
	 * 
	 * @param width
	 * @param height
	 * @param title
	 * @return void
	 */
	public static void createWindow(int width, int height, String title) {
				
		//Create the attributes
		ContextAttribs attribs = new ContextAttribs(3,2)
				.withForwardCompatible(true)
				.withProfileCore(true);
		//Set the title of our window
		Display.setTitle(title);
		//Try to create a window
		try {
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.create(new PixelFormat(), attribs);
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Render method for the window class
	 * 
	 * @return void
	 */
	public static void render() {
		Display.sync(FPS_CAP);
		Display.update();
	}
	
	/**
	 * Destroys the window
	 * 
	 * @return void
	 */
	public static void dispose() {
		Display.destroy();
	}
	
	/**
	 * Getter for the X button
	 * 
	 * @return isCloseRequested
	 */
	public static boolean isCloseRequsted() {
		return Display.isCloseRequested();
	}
	
	/**
	 * Getter for the width of the window
	 * 
	 * @return width
	 */
	public static int getWidth() {
		return Display.getDisplayMode().getWidth();
	}
	
	/**
	 * Getter for the height of the window
	 * 
	 * @return height
	 */
	public static int getHeight() {
		return Display.getDisplayMode().getHeight();
	}
	
	/**
	 * Getter for the window title
	 * 
	 * @return title
	 */
	public static String getTitle() {
		return Display.getTitle();
	}
}
