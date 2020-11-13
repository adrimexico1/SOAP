/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uv.calc;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author adrian
 */

@WebService
@Stateless
public class SumaBean {
    
    
    @WebMethod
    public int suma (int x, int y){
    return x+y;
    }
    
    
}
