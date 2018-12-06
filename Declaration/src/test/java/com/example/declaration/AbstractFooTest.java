/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.declaration;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author jhenriquez
 */
public abstract class AbstractFooTest
{
    protected abstract Foo createFoo();
    
    @Test
    public void testFoo()
    {
        Foo foo = createFoo();
        
        assertEquals("Expected value was not returned by addIntegers function", 0, foo.addIntegers(0, 0));
        
    }
    
}
