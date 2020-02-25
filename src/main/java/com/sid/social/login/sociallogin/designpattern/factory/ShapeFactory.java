package com.sid.social.login.sociallogin.designpattern.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeName){
        if(shapeName.equalsIgnoreCase("circle")){
            return new CIrcle();
        }
        if(shapeName.equalsIgnoreCase("triangle")){
            return new Triangle();
        }
        return null;
    }

}
