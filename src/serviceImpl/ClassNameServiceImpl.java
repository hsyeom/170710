package serviceImpl;

import service.ClassNameService;
import service.ClassService;

public class ClassNameServiceImpl implements ClassNameService{
	@Override
	public void printName(String className) {
		System.out.println(className);
	}
}
