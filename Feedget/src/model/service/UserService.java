package model.service;

import model.dao.UserDao;
import model.dto.UserDto;

public class UserService {
	private static UserService instance = new UserService();
	private UserService() {
		/*pass*/
	}
	public static UserService getInstance() {
		return instance;
	}
	public UserDto login(String email, String password) {
		UserDto dto = UserDao.getInstance().find(email);
		if(dto!=null) {
			if(dto.getPassword().equals(password)) {
				return dto;
			}
			return null;
		}
		return null;
	}
	public Object join(String email, String password,String name) {
		return null;
	}
}
