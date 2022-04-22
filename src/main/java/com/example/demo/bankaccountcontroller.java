package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class bankaccountcontroller {
	@Autowired
	static bankaccountservice service;
	
	public static void setService(bankaccountservice service) {
		bankaccountcontroller.service = service;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("banks.xml");
		bankaccountcontroller controller = (bankaccountcontroller) context.getBean("control");
		bankacc account = (bankacc) context.getBean("acc");
		bankacc account1 = (bankacc) context.getBean("acc1");
		System.out.println(service.getBalance(account.getAccountId()));
		System.out.println(service.fundTransfer(account.getAccountId(), account1.getAccountId(), 100));
		System.out.println(service.getBalance(account1.getAccountId()));
	}
}