package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	
        	Car c = new Car();
        	c.setAge(28);
        	c.setHasLicense(true);
        	c.setYearsWithLicense(3);
        	     
            kSession.insert(c);
            
            kSession.fireAllRules();
            
            System.out.println(c);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
