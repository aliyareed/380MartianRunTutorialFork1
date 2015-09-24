package com.gamestudio64.martianrun.box2d;


import com.badlogic.gdx.math.Vector2;
import com.gamestudio64.martianrun.enums.UserDataType;
import com.gamestudio64.martianrun.utils.Constants;

public class EnemyUserData extends UserData {

    private Vector2 linearVelocity;

    public EnemyUserData(float _width, float _height){
        super(_width,_height);
        userDataType = UserDataType.ENEMY;
        linearVelocity = Constants.ENEMY_LINEAR_VELOCITY;
    }

    public Vector2 getLinearVelocity() {
        return linearVelocity;
    }

    public void setLinearVelocity(Vector2 linearVelocity) {
        this.linearVelocity = linearVelocity;
    }


}
