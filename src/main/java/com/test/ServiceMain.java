package com.test;


import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

public class ServiceMain {

    @Inject
    public GuiceService gs = null;

    public static void main (String args[]){
        ServiceMain smain = new ServiceMain();

        Module sm = new ServiceModule();
        Injector injector = Guice.createInjector(sm);
        injector.injectMembers(smain);
        int i = 0;
        while (i<10){
         System.out.println("helllo");
            i++;
        }
        
        Module sm1 = new ServiceModule();
          System.out.println(smain.gs.serviceMethod("Hello"));
        System.out.println(smain.gs.serviceMethod("Hsaelloqasadwqwqwqwqwqwqw"));


    }




}
