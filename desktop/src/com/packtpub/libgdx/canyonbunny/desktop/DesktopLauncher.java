package com.packtpub.libgdx.canyonbunny.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.packtpub.libgdx.canyonbunny.CanyonBunnyMain;

public class DesktopLauncher {

	private static boolean rebuildAtlas = true;
	private static boolean drawDebugOutline = true;

	public static void main(String[] arg) {
		if (rebuildAtlas) {
			Settings settings = new Settings();
			settings.maxWidth = 1024;
			settings.maxHeight = 1024;
			settings.debug = drawDebugOutline;
			//TexturePacker.process(settings, "assets-raw/images",
			//		"../android/assets/images", "canyonbunny.pack");
		}
		LwjglApplicationConfiguration cfg = new
				LwjglApplicationConfiguration();
				 cfg.title = "CanyonBunny";
				 cfg.width = 800;
				 cfg.height = 480;
				 new LwjglApplication(new CanyonBunnyMain(), cfg);
	}
}
