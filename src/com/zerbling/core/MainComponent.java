/**
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/ or send a letter to Creative Commons,
 * 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
 * 
 * @author Flavio Kleiber <zerbarian@gmail.com>
 * @desc This is our main Component, we can use it in the dev phase for
 * 			dirty hacks,
 * 			rage comments
 * 			and more fun stuff
 */

package com.zerbling.core;

public class MainComponent {
	
	/**
	 * Const for the width
	 */
	public static final int WIDTH = 800;
	
	/**
	 * Const for the height
	 */
	public static final int HEIGHT = 600;
	
	/**
	 * Const for the title
	 */
	public static final String TITLE = "Zerbling Game Engine v0.0.1";
	
	/**
	 * Const for the frame cap
	 */
	public static final double FRAME_CAP = 5000.0;
	
	//Var for the loop
	private boolean isRunning;
	
	//Var for game class
	private Game game;
	
	/**
	 * Class constructor
	 * 
	 * @return void
	 */
	public MainComponent() {
		this.isRunning = false;
		this.game = new Game();
	}
	
	/**
	 * Simple start method, that starts the game
	 * 
	 * @return void
	 */
	public void start() {
		
		//If we are running just return
		if(this.isRunning) {
			return;
		}
		isRunning = true;
		this.run();
	}
	
	/**
	 * Stops the game form running
	 * 
	 * @return void
	 */
	public void stop() {
		//If we are not running, than we can stop ;)
		if(!this.isRunning) {
			return;
		}
		
		this.isRunning = false;
	}
	
	/**
	 * Run forest run
	 * 
	 * @return void
	 */
	private void run() {
		
		//How long ticks a frame
		long lastTime = Time.getTime();
		double unprocessedTime = 0;
		int frames = 0;
		long frameCounter = 0;
		
		//Loop
		while(this.isRunning) {
			
			boolean toRender = false;
			final double frameTime = 1.0 / FRAME_CAP;
			long startTime = Time.getTime();
			long passedTime = startTime - lastTime;
			lastTime = startTime;
			
			unprocessedTime += passedTime / (double)Time.SECOND;
			frameCounter += passedTime;
			
			while(unprocessedTime > frameTime) {
				toRender = true;
				unprocessedTime -= frameTime;
				
				//If we have a close request just stop
				if(Window.isCloseRequsted()) {
					this.stop();
				}
				
				//Set delta time
				Time.setDelta(frameTime);
				
				//Input update call
				Input.update();
				
				//Game method call
				this.game.input();
				this.game.update();
				
				if(frameCounter >= Time.SECOND) {
					System.out.println("FPS: " + frames);
					frames = 0;
					frameCounter = 0;
				}
			}
			
			if(toRender) {
				this.render();
				frames ++;
			} else {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		//If we are out of the loop clean up 
		this.cleanUp();
	}
	
	/**
	 * Simple render method
	 * 
	 * @return void
	 */
	private void render() {
		//Render our window
		Window.render();
		this.game.render();
	}
	
	/**
	 * Clean up method
	 * 
	 * @return void
	 */
	private void cleanUp() {
		//Clear the window
		Window.dispose();
	}
	
	/**
	 * Main method
	 * 
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		
		//Lets create a window!
		Window.createWindow(WIDTH, HEIGHT, TITLE);
		
		//Create here a new Component object
		MainComponent gameObj = new MainComponent();
		gameObj.start();
	}
	
}
