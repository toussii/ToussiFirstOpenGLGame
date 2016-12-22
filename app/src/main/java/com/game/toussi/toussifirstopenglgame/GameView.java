package com.game.toussi.toussifirstopenglgame;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class GameView extends  GLSurfaceView{

    public GameView(Context context) {
        super(context);
        final GameRenderer gameRenderer;
        setEGLContextClientVersion(2);
        gameRenderer = new GameRenderer(context);
        setRenderer(gameRenderer);
    }
}
