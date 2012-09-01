/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.ad;

import org.databene.benerator.util.ThreadSafeNonNullGenerator;

/**
 *
 * @author rishu.mehrotra
 */
public class ImpressionIdGenerator extends ThreadSafeNonNullGenerator<String> {
    
    
    protected String host;
    
    public Class<String> getGeneratedType() {
	    return String.class;
    }

    public ImpressionIdGenerator() {
    }

    public ImpressionIdGenerator(String host) {
        this.host = host;
    }

    
    
    @Override
    public String generate() {
        
        
        return null;
    }
    
       
}
