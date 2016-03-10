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

public class Input {
	
	/**
	 * Number of key codes, well for a standart asci
	 * keyboard it will do it!
	 */
	public static final int NUM_KEYCODES = 256;
	
	//List for our current keys
	private static ArrayList<Integer> currentKeys = new ArrayList<Integer>();
	
	//List for all keys that are pressed in a single frame
	private static ArrayList<Integer> downKeys = new ArrayList<Integer>();
	
	//List for all keys that are released in a single frame
	private static ArrayList<Integer> upKeys = new ArrayList<Integer>();
	
	/**
	 * This will be called every frame,
	 * so look what you do here!
	 * 
	 * @return void
	 */
	public static void update() {
		
		//Clear the list
		Input.upKeys.clear();
		
		//Loop trough all key codes
		for(int i = 0; i < Input.NUM_KEYCODES; i++) {
			
			//If the key was pressed last frame, but we dont press it in this frame, add it to the list
			if(!Input.getKey(i) && Input.currentKeys.contains(i)) {
				Input.upKeys.add(i);
			}
		}
		
		//Clear the list
		Input.downKeys.clear();
		
		//Loop trough all key codes
		for(int i = 0; i < Input.NUM_KEYCODES; i++) {
			
			//If key is pressed add it to the list
			if(Input.getKey(i) && !Input.currentKeys.contains(i)) {
				Input.downKeys.add(i);
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
		
		//If we find the key in the key down list its pressed
		if(Input.downKeys.contains(keyCode)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * This method returns true if the button is released
	 * 
	 * @param keyCode
	 * @return boolean
	 */
	public static boolean getKeyUp(int keyCode) {
		
		//If we find the key in the key up list its released
		if(Input.upKeys.contains(keyCode)) {
			return true;
		}
		
		return false;
	}
	
}
