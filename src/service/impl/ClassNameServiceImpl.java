package service.impl;

import service.ClassNameService;
import service.ClassService;

public class ClassNameServiceImpl implements ClassNameService{
	@Override
	public void printName(String className) {
		System.out.println(className);
	}
	
	private ClassService classService;
	
	@Override
	public void setClassName(ClassService classService) {
		this.classService = classService;
	}
	
	@Override
	public void WhatIsYourName() {
		classService.getFirstName();
		classService.getMiddleName();
		classService.getLastname();
	}

	@Override
	public void WhatIsYourFirstName() {
		classService.getFirstName();
	}

	@Override
	public void WhatIsYourLastName() {
		classService.getLastname();
	}
}
