package com.gamestudio64.martianrun;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gamestudio64.martianrun.screens.GameScreen;

public class MartianRun extends Game {
    //This is where the control flow of the application happens.
    //This is the Controller


    @Override
    public void create() {
        //This will set the GameScreen on startup
        setScreen(new GameScreen());
    }
}
