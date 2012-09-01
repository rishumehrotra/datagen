/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.rr;

/**
 *
 * @author rishu.mehrotra
 */
public enum Version {
    
    FIVE(5),SIX(6);
    
    int value;
    
    public Integer getValue()
    {
        return value; 
    }
    
    Version(int value)
    {
        this.value=value;
    }
    
}
