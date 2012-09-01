/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.rr;

import org.databene.benerator.NonNullGenerator;
import org.databene.benerator.dataset.DatasetBasedGenerator;
import org.databene.benerator.primitive.datetime.DateGenerator;
import org.databene.benerator.wrapper.CompositeGenerator;
import org.databene.commons.converter.TimestampFormatter;
import org.databene.domain.person.Person;

/**
 *
 * @author rishu.mehrotra
 */
public class RRGenerator extends CompositeGenerator<RR> 
		implements DatasetBasedGenerator<RR>, NonNullGenerator<RR>{
    
    private Integer version;
    
    private DateGenerator dateGenerator;
    private TerminatedGenerator terminatedGenerator;
    //hostgenerator to be done
    private BucketGenerator bucketGenerator;
    
    
    
    
    
}
