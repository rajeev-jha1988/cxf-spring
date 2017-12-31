/**
 * 
 */
package com.raj.cxf.service.impl;

import javax.jws.WebService;

import com.raj.cxf.service.HelloService;

/**
 * @author rajeev
 *
 */
@WebService(endpointInterface="com.raj.cxf.service.HelloService")
public class HelloServiceImpl implements HelloService {
	public String sayHello(String name) {
		return "Hello "+name;
	}

}
