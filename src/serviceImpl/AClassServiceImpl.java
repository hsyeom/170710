package serviceImpl;

import service.ClassService;

public class AClassServiceImpl implements ClassService{
	@Override
	public String className() {
		return this.getClass().getName();
	}
}
