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
public class VersionGenerator extends NonNullGeneratorProxy<Version> {
    
    private double fiveQuota;

    public double getFiveQuota() {
        return fiveQuota;
    }

    public void setFiveQuota(double fiveQuota) {
        this.fiveQuota = fiveQuota;
    }
    
    public VersionGenerator()
    {
        this(0.5);
    }
    
    public VersionGenerator(Double fiveQuota)
    {
        super(Version.class);
        setFiveQuota(fiveQuota);
    }
    
    @Override
    public Class<Version> getGeneratedType() {
        return Version.class;
    }
    
        @SuppressWarnings("unchecked")
	@Override
    public synchronized void init(GeneratorContext context) {
    	assertNotInitialized();
	    List<WeightedSample<Version>> samples = CollectionUtil.toList(
    		new WeightedSample<Version>(Version.FIVE, fiveQuota),
    		new WeightedSample<Version>(Version.SIX, 1 - fiveQuota)
	    );
		Generator<Version> source = context.getGeneratorFactory().createWeightedSampleGenerator(samples, Version.class);
		setSource(WrapperFactory.asNonNullGenerator(source));
        super.init(context);
    }
    
    
    
}
