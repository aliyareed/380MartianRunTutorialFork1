package com.gamestudio64.martianrun.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gamestudio64.martianrun.MartianRun;
import com.gamestudio64.martianrun.screens.GameScreen;
import com.gamestudio64.martianrun.utils.Constants;


//This will essentially be our main class
public class DesktopLauncher {
    //This is the main method for the game
    public static void main(String[] args) {
        //Light weight java game library
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        //config class configures our main window
        config.width = Constants.APP_WIDTH;
        config.height = Constants.APP_HEIGHT;
        new LwjglApplication(new MartianRun(), config);
    }
}