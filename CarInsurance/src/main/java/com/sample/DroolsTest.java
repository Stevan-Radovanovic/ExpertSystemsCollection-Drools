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

        	Car car = new Car();
        	
        	car.setMotorPower(50);
        	car.setOldPremiumGrade(11); 
        	car.setAccidents(2);
        	
            kSession.insert(car);
            kSession.fireAllRules();
        
            System.out.println(car);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}