package service.impl;

import service.ClassService;

public class AClassServiceImpl implements ClassService{
	
	String[] className;
	String strSeperator = ".";

	public AClassServiceImpl() {
		this.className = this.getClass().getName().split("\\.");
	}
	
	@Override
	public String className() {
		return this.getClass().getName();
	}

	@Override
	public void setSeperator(String seperator) {
		this.strSeperator = seperator;
	}

	@Override
	public void getFirstName() {
		System.out.print(className[0]);
	}

	@Override
	public void getMiddleName() {
		Integer nameIdx = 0;
		for(String nm : className) {
			if(className.length > 2)
				if(nameIdx != 0 && nameIdx != className.length-1) {
					System.out.print(" " + nm);
				}
			
			nameIdx++;
		}
	}

	@Override
	public void getLastname() {
		System.out.print(className[className.length-1]);
	}
}
