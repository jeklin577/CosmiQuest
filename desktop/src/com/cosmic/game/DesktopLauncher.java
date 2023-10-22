package com.cosmic.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.cosmic.game.CosmicQuestGameClass;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(1080, 720);
		config.setForegroundFPS(60);
		config.useVsync(true);
		config.setTitle("CosmicQuest");
		new Lwjgl3Application(new CosmicQuestGameClass(), config);
	}
	
	
}
