package controller;

import service.ClassNameService;
import service.impl.AClassServiceImpl;
import service.impl.BClassServiceImpl;
import service.impl.ClassNameServiceImpl;

public class MainController {
	public static void main(String[] args) {
		System.out.println("I asked name to Korean");
		ClassNameService korean = new ClassNameServiceImpl();
		
		korean.setClassName(new AClassServiceImpl());
		System.out.print("First name is ");
		korean.WhatIsYourFirstName();
		System.out.println();
		System.out.print("Last name is ");
		korean.WhatIsYourLastName();
		System.out.println();
		System.out.print("My name is ");
		korean.WhatIsYourName();
		System.out.println();
		System.out.println();
		
		System.out.println("I asked name to Foreigner");
		
		ClassNameService foreign = new ClassNameServiceImpl();
		foreign.setClassName(new BClassServiceImpl());
		System.out.print("First name is ");
		foreign.WhatIsYourFirstName();
		System.out.println();
		System.out.print("Last name is ");
		foreign.WhatIsYourLastName();
		System.out.println();
		System.out.print("My name is ");
		foreign.WhatIsYourName();
		System.out.println();
		System.out.println();
	}
	
	
}
