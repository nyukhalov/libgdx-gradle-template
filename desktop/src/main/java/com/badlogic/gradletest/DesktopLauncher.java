
package com.badlogic.gradletest;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "my-gdx-game";
		config.useGL30 = false;
		config.width = 480;
		config.height = 320;

		new LwjglApplication(new HelloApp(), config);
	}
}
