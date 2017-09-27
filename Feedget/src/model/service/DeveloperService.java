package model.service;

import model.dao.DeveloperDao;
import model.dto.DeveloperDto;

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

	public DeveloperDto login(String email, String password) {
		DeveloperDto dto = DeveloperDao.getInstance().find(email);
		if(dto!=null) {
			if(dto.getPassword().equals(password)) {
				return dto;
			}
			return null;
		}
		return null;
	}
}
