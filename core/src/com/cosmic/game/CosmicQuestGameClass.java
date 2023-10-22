package com.cosmic.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class CosmicQuestGameClass extends ApplicationAdapter {
	SpriteBatch batch;
	
	Texture testface;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		testface = new Texture("TestFace.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		
		
		textbox textboxtest = new textbox();
		
		
			
		textboxtest.displayTextBox();
			
			textboxtest.IncrConvoProg();
			
			
			
			
			textboxtest.closeTextBox();
			
			
			//Alright, interesting, ConvoProg isn't incrementing despite being told to do so, why?
			//We're going to put it in a few more times, see if that fixes her up.
			//And it doesn't.
			//Alright, cataloguing thoughts time, so, let's break down where we could be fucking up:
			//Number 1, our IncrConvoProg method, despite evoking this method (which should increment the
			//ConvoProg value by one), 
			//NEVERMIND!!!! OK, so, if we position our increment statement BEFORE our show statement, 
			//then what we find is that we actually can increment our convoprog variable, the problem is,
			//we're just not updating it!
			
		
		
		
		
		
		
		
		
		
		
		
		batch.end();
		
			}
	
	@Override
	public void dispose () {
		batch.dispose();	
		testface.dispose();
	}
}
