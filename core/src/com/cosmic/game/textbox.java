package com.cosmic.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Array;

public class textbox {
	private Texture SpeakerImage;
	private String SpeakerName;
	private SpriteBatch Batch;
	private BitmapFont font;
	private boolean isActive;
	private String[] Lines;
	public int ConvoProg;
	
	
		
	
	public textbox() {
		SpeakerImage = new Texture("TestFace.png");
		SpeakerName = ("Testicles the centurion");
		Batch = new SpriteBatch();
		font = new BitmapFont();
		isActive = true;
		ConvoProg = 0;
		Lines = new String[5];
		Lines[0] = ("I am testicles, mighty centurion");
		Lines[1] = ("Behold my power ye mighty and despair");
		Lines[2] = ("By the way, would you mind grabbing me some fish and chips");
		Lines[3] = ("LOOK CLOSER, LENNY");
		Lines[4] = ("Oh, i see it now, you're king of the world, and you're covered in gold!");
		///Lines[5] = ("Wait, is this even real?");
		
	}
	
	public void displayTextBox() {
		
	
		Batch.begin();		
		Batch.draw(SpeakerImage, 180, 180);
		font.draw(Batch, SpeakerName,250,190);
		font.draw(Batch, Lines[ConvoProg], 170, 170);
		font.draw(Batch, ("Wowie" + ConvoProg), 300, 300);
		
	
		Batch.end();
		
	
	
	
		
		///Add in code here to wait for player input, then execute IncrConvoProg when you have done so
		///And also maybe dispose of the batch??? Alright, instant CTD, probably not.
		///So, what's our current problem? Stacking text, how are we going to deal with that? purge existing text each time we want to increment
		///How do we do that?
		///First, let's understand our problem, we're not removing (not calling) our draw functions each frame
		///So, while we do get Lines[ConvoProg], they end up stacking, because we're still calling them?
		
		
		
		
		
		
	}
	
	public void IncrConvoProg() {
		if (ConvoProg < Lines.length-1) {
		ConvoProg++;
		
		
		
		
		this.displayTextBox();
		}
		else {} //Can't increment to a point in an array that doesn't exist, so putting this here catches us if we accidently do that
	}
	
	
	
	public void closeTextBox() {
		isActive = false;
		
		
	}
	
	public void clearTextBox() {
		
	}
	
}
