package com.creativitystack.client;

import com.creativitystack.webservice.service.CalculadoraService;
import com.creativitystack.webservice.service.CalculadoraServiceImpService;

public class OperationClient {

    public static void main(String[] args){
        CalculadoraService serviceClient = new CalculadoraServiceImpService().getCalculadoraPort();
        System.out.println(serviceClient.addition(10,7861));
        System.out.println(serviceClient.sayHello("Jayline Ojeda"));
    }
}
