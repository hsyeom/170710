package controller;

import service.ClassNameService;
import serviceImpl.AClassServiceImpl;
import serviceImpl.BClassServiceImpl;
import serviceImpl.CClassServiceImpl;
import serviceImpl.ClassNameServiceImpl;

public class MainController {
	public static void main(String[] args) {
		ClassNameService cs=new ClassNameServiceImpl();
		cs.printName(new AClassServiceImpl().className());
		cs.printName(new BClassServiceImpl().className());
		cs.printName(new CClassServiceImpl().className());
	}
}
