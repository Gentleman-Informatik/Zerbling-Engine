/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/ or send a letter to Creative Commons,
 * 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
 * 
 * @author Flavio Kleiber <zerbarian@gmail.com>
 * @desc This is the class that will handel the input, because the game class was after the implementation tttoooo fucking big
 */
package com.zerbling.core;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import com.zerbling.math.Vector2f;

public class Input {
	
	/**
	 * Number of key codes, well for a standart asci
	 * keyboard it will do it!
	 */
	public static final int NUM_KEYCODES = 256;
	
	/**
	 * Number of how many buttons the mouse have,
	 * for now 5 its okay, later we can do that with detection
	 */
	public static final int NUM_MOUSE_BUTTONS = 5;
	
	//List for our current keys
	private static ArrayList<Integer> currentKeys = new ArrayList<Integer>();
	
	//List for all keys that are pressed in a single frame
	private static ArrayList<Integer> downKeys = new ArrayList<Integer>();
	
	//List for all keys that are released in a single frame
	private static ArrayList<Integer> upKeys = new ArrayList<Integer>();
	
	//List for our current keys
	private static ArrayList<Integer> currentMouse = new ArrayList<Integer>();
	
	//List for all mouse buttons that are pressed in a single frame
	private static ArrayList<Integer> mouseButtonDown = new ArrayList<Integer>();
		
	//List for all mouse buttons that are released in a single frame
	private static ArrayList<Integer> mouseButtonUp = new ArrayList<Integer>();
	
	/**
	 * This will be called every frame,
	 * so look what you do here!
	 * 
	 * @return void
	 */
	public static void update() {
		
		//Clear the list
		Input.upKeys.clear();
		Input.mouseButtonUp.clear();
		
		//Loop trough all key codes
		for(int i = 0; i < Input.NUM_KEYCODES; i++) {
			
			//If the key was pressed last frame, but we dont press it in this frame, add it to the list
			if(!Input.getKey(i) && Input.currentKeys.contains(i)) {
				Input.upKeys.add(i);
			}
		}
		
		//Loop trough all mouse buttons
		for(int i = 0; i < Input.NUM_MOUSE_BUTTONS; i++) {
			if(!Input.getMouseButton(i) && Input.currentMouse.contains(i)) {
				Input.mouseButtonUp.add(i);
			}
		}
		
		//Clear the list
		Input.downKeys.clear();
		Input.mouseButtonDown.clear();
		
		//Loop trough all key codes
		for(int i = 0; i < Input.NUM_KEYCODES; i++) {
			
			//If key is pressed add it to the list
			if(Input.getKey(i) && !Input.currentKeys.contains(i)) {
				Input.downKeys.add(i);
			}
		}
		
		//Loop trough all mouse buttons
		for(int i = 0; i < Input.NUM_MOUSE_BUTTONS; i++) {
			if(Input.getMouseButton(i) && !Input.currentMouse.contains(i)) {
				Input.mouseButtonDown.add(i);
			}
		}
		
		//Clear our list
		Input.currentKeys.clear();
		
		//Loop trough all key codes
		for(int i = 0; i < Input.NUM_KEYCODES; i++) {
			
			//If key is pressed add it to the list
			if(Input.getKey(i)) {
				Input.currentKeys.add(i);
			}
		}
		
		//Clear mouse list
		Input.currentMouse.clear();
		
		//Loop trough all mouse buttons and check if there are pressed
		for(int i = 0; i < Input.NUM_MOUSE_BUTTONS; i ++) {
			
			if(Input.getMouseButton(i)) {
				Input.currentMouse.add(i);
			}
		}
	}
	
	/**
	 * This method will return of the key is pressed
	 * 
	 * @param keyCode
	 * @return boolean
	 */
	public static boolean getKey(int keyCode) {
		return Keyboard.isKeyDown(keyCode);
	}
	
	/**
	 * This method returns if the key is down
	 * 
	 * @param keyCode
	 * @return boolean 
	 */
	public static boolean getKeyDown(int keyCode) {
		return Input.downKeys.contains(keyCode);
	}
	
	/**
	 * This method returns true if the button is released
	 * 
	 * @param keyCode
	 * @return boolean
	 */
	public static boolean getKeyUp(int keyCode) {
		return Input.upKeys.contains(keyCode);
	}
	
	/**
	 * This method will return true if the mouse button is pressed
	 * 
	 * @param buttonCode
	 * @return boolean
	 */
	public static boolean getMouseButton(int buttonCode) {
		return Mouse.isButtonDown(buttonCode);
	}
	
	/**
	 * Return true if the mouse button is down
	 * 
	 * @param buttonCode
	 * @return boolean
	 */
	public static boolean getMouseButtonDown(int buttonCode) {
		return Input.mouseButtonDown.contains(buttonCode);
	}
	
	/**
	 * Returns true if the mouse button is released
	 * 
	 * @param buttonCode
	 * @return boolean
	 */
	public static boolean getMouseButtonUp(int buttonCode) {
		return Input.mouseButtonUp.contains(buttonCode);
	}
	
	/**
	 * Method returns mouse pos
	 * 
	 * @return Vector2f
	 */
	public static Vector2f getMousePosition() {
		return new Vector2f(Mouse.getX(), Mouse.getY());
	}
	
}
