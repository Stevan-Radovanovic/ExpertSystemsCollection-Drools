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

            // go !
            Transit t = new Transit();
            t.setDistance(5);
            t.setHasMoney(false);
            t.setTerain("Flat");
            t.setWantsTraining(false);
            kSession.insert(t);
            kSession.fireAllRules();
            System.out.println(t);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }



}
