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
            Unos unos = new Unos();
            unos.setIskustvo("Ne");
            unos.setOblast("Pocetnik sam i nemam definisanu");
            unos.setProgramskiJezik("Ne poznajem nijedan");
            unos.setBrojGodina(20);
            unos.setFaksIt("Ne");
            kSession.insert( unos );
            
            kSession.fireAllRules();
            
            System.out.print(unos);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }


}
