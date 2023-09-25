package com.his.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.erp.core.web.BaseBean;

@Component("customerBean")
@Scope("request")
public class CustomerBean extends BaseBean{
	
	public void saveCust(){
		System.out.println(":::::::::Called savecustomer ::::::::::::");
	}

}
