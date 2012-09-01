/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.rr;

import java.util.List;
import org.databene.benerator.Generator;
import org.databene.benerator.GeneratorContext;
import org.databene.benerator.wrapper.NonNullGeneratorProxy;
import org.databene.benerator.wrapper.WrapperFactory;
import org.databene.commons.CollectionUtil;
import org.databene.domain.person.Gender;
import org.databene.script.WeightedSample;

/**
 *
 * @author rishu.mehrotra
 */
public class TerminatedGenerator extends NonNullGeneratorProxy<Terminated> {
    
    private Double nladQuota;

    public void setNladQuota(Double nladQuota) {
        this.nladQuota = nladQuota;
    }
    
    public TerminatedGenerator()
    {
        this(0.5);
    }
    
    public TerminatedGenerator(Double nladQuota)
    {
        super(Terminated.class);
        setNladQuota(nladQuota);
    }
    
    @Override
    public Class<Terminated> getGeneratedType() {
        return Terminated.class;
    }
    
   @SuppressWarnings("unchecked")
   @Override
    public synchronized void init(GeneratorContext context) {
    	assertNotInitialized();
	    List<WeightedSample<Terminated>> samples = CollectionUtil.toList(
    		new WeightedSample<Terminated>(Terminated.NLAD, nladQuota),
    		new WeightedSample<Terminated>(Terminated.NO, 1 - nladQuota)
	    );
		Generator<Terminated> source = context.getGeneratorFactory().createWeightedSampleGenerator(samples, Terminated.class);
		setSource(WrapperFactory.asNonNullGenerator(source));
        super.init(context);
    }
   
   
}
