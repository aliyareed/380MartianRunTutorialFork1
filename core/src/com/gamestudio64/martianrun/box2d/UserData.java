package com.gamestudio64.martianrun.box2d;

import com.gamestudio64.martianrun.enums.UserDataType;

/**
 *
 */
public abstract class UserData {
    protected UserDataType userDataType;

    public UserData(){}
    public UserDataType getUserDataType(){
        return userDataType;
    }
    public UserData(float _width, float _height){
        width = _width;
        height = _height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    protected float width;
    protected float height;
}
