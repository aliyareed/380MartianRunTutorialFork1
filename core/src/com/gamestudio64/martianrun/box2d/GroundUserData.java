package com.gamestudio64.martianrun.box2d;

import com.gamestudio64.martianrun.enums.UserDataType;

/**
 *
 */
public class GroundUserData extends UserData {
    public GroundUserData(){
        super();
        userDataType = UserDataType.GROUND;
    }
}
