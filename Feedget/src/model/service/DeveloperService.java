package model.service;

import model.dao.DeveloperDao;

public class DeveloperService {
	/*
	 * Filed
	 */
	private static DeveloperService instance = new DeveloperService();

	/*
	 * Method
	 */
	private DeveloperService() {
	}

	public static DeveloperService getInstance() {
		return instance;
	}

	public void registDeveloper(String name, String email, String password, String company, String site,
			String category) {
		DeveloperDao.getInstance().insert(name, company, email, password, category, site);
	}

	public boolean emailIsUnique(String email) {
		if (DeveloperDao.getInstance().find(email) == null) {
			return true;
		}
		return false;
	}
}
