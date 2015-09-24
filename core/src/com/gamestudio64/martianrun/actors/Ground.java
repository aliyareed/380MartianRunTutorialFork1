package com.gamestudio64.martianrun.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.gamestudio64.martianrun.box2d.GroundUserData;
import com.gamestudio64.martianrun.box2d.UserData;

/**
 *
 */
public class Ground extends GameActor {
    public Ground(Body body){
        super(body);
    }
    public UserData getUserData(){
        return (GroundUserData) userData;
    }

}
