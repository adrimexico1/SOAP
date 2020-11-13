/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapclient;

import uv.client.SumaBean;
import uv.client.SumaBeanService;

/**
 *
 * @author adrian
 */
public class SOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SumaBeanService sumaService = new SumaBeanService();
        SumaBean suma = sumaService.getSumaBeanPort();
        System.out.println("La suma es:"+ suma.suma(5, 4));
    }
    
}
