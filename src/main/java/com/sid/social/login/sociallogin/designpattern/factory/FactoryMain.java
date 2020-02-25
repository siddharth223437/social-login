package com.sid.social.login.sociallogin.designpattern.factory;

public class FactoryMain {

    public static void main(String[] args){
        ShapeFactory.getShape("circle").drawShape();
        ShapeFactory.getShape("circle").drawShape();
        ShapeFactory.getShape("circle").drawShape();
        ShapeFactory.getShape("triangle").drawShape();
    }
}
