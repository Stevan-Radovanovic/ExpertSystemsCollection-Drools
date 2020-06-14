package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;



public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	AirConditioner a = new AirConditioner();
           
        	a.setHeatingWhenItsColdAsFuck(true);
        	a.setMultipleRooms(false);
        	a.setSquareMeters(66);
        	
            kSession.insert(a);
            
            kSession.fireAllRules();
            
           System.out.println(a);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

   

}
