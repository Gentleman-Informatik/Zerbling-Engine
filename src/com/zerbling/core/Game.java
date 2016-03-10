/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/ or send a letter to Creative Commons,
 * 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
 * 
 * @author Flavio Kleiber <zerbarian@gmail.com>
 * @desc Game class handles input and have some nice little render and update methods
 */
package com.zerbling.core;

import org.lwjgl.input.Keyboard;

public class Game {

	//JUST A SKELETON FOR THE MOMENT
	//DONT PANIK PEOPLE
	
	public Game() {}
	
	public void update() {}
	
	public void render() {}
	
	public void input() {
		
		if(Input.getKeyDown(Keyboard.KEY_UP)) {
			System.out.println("Pressed UP Key");
		}
		if(Input.getKeyUp(Keyboard.KEY_UP)) {
			System.out.println("Released UP Key");
		}
		
		if(Input.getMouseButtonDown(1)) {
			System.out.println("Clicked right mouse");
		}
		if(Input.getMouseButtonUp(1)) {
			System.out.println("Released right mous");
		}
		
		//System.out.println("MousPos" + Input.getMousePosition().toString());
		
	}
	
}
