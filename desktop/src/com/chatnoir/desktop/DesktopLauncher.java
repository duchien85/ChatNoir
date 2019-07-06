package com.chatnoir.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.chatnoir.ChatNoir;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width =540;
		config.height =620;
		config.resizable = false;
		new LwjglApplication(new ChatNoir(), config);
	}
}
