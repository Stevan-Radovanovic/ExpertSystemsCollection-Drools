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
        	car.setMotorPower(30);
        	car.setCarAccidentAmount(54);
        	car.setOldPremiumGrade(4);
        	car.setFirstRegistration(false);
        	
            kSession.insert(car);
            kSession.fireAllRules();
        
            System.out.println(car);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}