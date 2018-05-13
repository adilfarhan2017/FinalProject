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


       for (int i=0;i<10;i++){

           System.out.println("Print "+i);
       }
          System.out.println(smain.gs.serviceMethod("Hello"));
        System.out.println(smain.gs.serviceMethod("Hsaelloqasadwqwqwqwqwqwqw"));


    }




}
