package ch13.domain.userinfo.dao.myssql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert info MySql DB = "+ userInfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update info MySql DB = "+ userInfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from MySql DB = "+ userInfo.getUserID());
	}

}
