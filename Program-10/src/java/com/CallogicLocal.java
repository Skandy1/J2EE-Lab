/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.ejb.Local;

/**
 *
 * @author SKANDA
 */
@Local
public interface CallogicLocal {
    public double add(double num1,double num2);
    
    public double sub(double num1,double num2);
    
    public double mul(double num1,double num2);
    
    public double div(double num1,double num2);
    
}
