package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert info Oracle DB = "+ userInfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update info Oracle DB = "+ userInfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from Oracle DB = "+ userInfo.getUserID());
	}

}
