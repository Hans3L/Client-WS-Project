package com.creativitystack.client;

import com.creativitystack.webservice.service.CalculadoraService;
import com.creativitystack.webservice.service.CalculadoraServiceImpService;
import javax.xml.ws.WebServiceRef;


public class Operation2Client {
    // interface CalculadoraService         class CalculadoraServiceImpService
    @WebServiceRef(wsdlLocation = "http://localhost:8080/ws-project-1.0/CalculadoraServiceImp?wsdl")
        static CalculadoraService port = new CalculadoraServiceImpService().getCalculadoraPort();

    public static void main(String[] args) {
        try {
            Operation2Client client = new Operation2Client();
            client.doTest(args);
            System.out.println(port.sayHello("Perú"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doTest(String[] args) {
        try {
            System.out.println("Invoking the sayHello operation on the port. " + port);
            String name;
            if (args.length > 0) {
                name = args[0];
            } else {
                name = "No Name";
            }
            String response = port.sayHello(name);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
