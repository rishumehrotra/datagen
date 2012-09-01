/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.handset;

import org.databene.benerator.NonNullGenerator;
import org.databene.benerator.dataset.DatasetBasedGenerator;
import org.databene.benerator.wrapper.CompositeGenerator;
import org.databene.domain.person.Person;

/**
 *
 * @author rishu.mehrotra
 */
public class HandsetGenerator extends CompositeGenerator<Handset> 
		implements DatasetBasedGenerator<Handset>, NonNullGenerator<Handset> {
    
          
          private DeviceParameterGenerator dparamGenerator;
          
          public HandsetGenerator()
          {
             this("abcsqwrerty");
          }
          
          public HandsetGenerator(String externalId)
          {
             super(Handset.class);
             dparamGenerator=registerComponent(new DeviceParamGenerator(1.2));
          }
          
          public Handset generateForDataSet(String externalId)
          {
              assertInitialized();
              
          }
    
}
