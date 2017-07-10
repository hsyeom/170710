package serviceImpl;

import service.ClassService;

public class CClassServiceImpl implements ClassService{
	@Override
	public String className() {
		return this.getClass().getName();
	}
}

