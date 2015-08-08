package com.packtpub.libgdx.canyonbunny.game;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;

public class AssetBunny {
	public final AtlasRegion head;

	public AssetBunny(TextureAtlas atlas) {
		//set up the region with bunny-head picture
		head = atlas.findRegion("bunny_head");
	}
}