/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.implementation;

import com.example.declaration.AbstractFoo;


/**
 *
 * @author jhenriquez
 */
public class FooImplementation extends AbstractFoo
{
    @Override
    public int addIntegers(int one, int two)
    { 
        return one + two;
        
    }
}
