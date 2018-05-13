package com.test;

import com.google.inject.AbstractModule;

public class ServiceModule extends AbstractModule{

    protected void configure(){

        bind(GuiceService.class).to(GuiceServiceImpl.class);


    }



}
