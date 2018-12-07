/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.implementation;

import com.example.declaration.test.AbstractFooTest;
import com.example.declaration.Foo;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author jhenriquez
 */
public class FooImplementationTest extends AbstractFooTest
{
    
    public FooImplementationTest()
    {
    }

    @Test
    public void testAddIntegers()
    {
        System.out.println("addIntegers");

        Foo instance = createFoo();

        assertEquals(0, instance.addIntegers(0, 0));

    }
    

    @Override
    protected Foo createFoo()
    {
        return new FooImplementation();
        
    }
}
