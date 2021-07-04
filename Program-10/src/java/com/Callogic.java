/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.ejb.Stateless;

/**
 *
 * @author SKANDA
 */
@Stateless
public class Callogic implements CallogicLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public double add(double num1,double num2){
        return num1+num2;
    }
    @Override
    public double sub(double num1,double num2){
        return num1-num2;
    }
    @Override
    public double mul(double num1,double num2){
        return num1*num2;
    }
    @Override
    public double div(double num1,double num2){
        return num1/num2;
    }
}
