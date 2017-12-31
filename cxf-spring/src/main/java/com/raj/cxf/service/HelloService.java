/**
 * 
 */
package com.raj.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author rajeev
 *
 */
@WebService
public interface HelloService {
	
	@WebMethod
	String sayHello(String name);
}
