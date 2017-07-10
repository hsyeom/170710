package serviceImpl;

import service.ClassService;

public class BClassServiceImpl implements ClassService{
	@Override
	public String className() {
		return this.getClass().getName();
	}
}

