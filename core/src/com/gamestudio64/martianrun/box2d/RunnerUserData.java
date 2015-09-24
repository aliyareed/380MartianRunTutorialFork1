package com.gamestudio64.martianrun.box2d;

import com.badlogic.gdx.math.Vector2;
import com.gamestudio64.martianrun.enums.UserDataType;
import com.gamestudio64.martianrun.utils.Constants;

/**
 *
 */
public class RunnerUserData extends UserData {
    private Vector2 jumpingLinearImpulse;
    private final Vector2 runningPosition = new Vector2(Constants.RUNNER_X, Constants.RUNNER_Y);
    private final Vector2 dodgePosition = new Vector2(Constants.RUNNER_DODGE_X, Constants.RUNNER_DODGE_Y);


    public RunnerUserData(float _width, float _height){
        super(_width, _height);
        jumpingLinearImpulse = Constants.RUNNER_JUMPING_LINEAR_IMPULSE;
        userDataType = UserDataType.RUNNER;
    }
    public Vector2 getJumpingLinearImpulse(){
        return jumpingLinearImpulse;
    }

    public void setJumpingLinearImpulse(Vector2 jumpingLinearImpulse){
        this.jumpingLinearImpulse = jumpingLinearImpulse;
    }

    public float getDodgeAngle(){
        // In radians
        return (float) (-90f * (Math.PI / 180f));
    }

    public Vector2 getRunningPosition(){
        return runningPosition;
    }

    public Vector2 getDodgePosition(){
        return dodgePosition;
    }

    public float getHitAngularImpulse(){
        return Constants.RUNNER_HIT_ANGULAR_IMPULSE;
    }
}
