package cn.lmn.service;

import java.util.List;
import cn.lmn.entity.User;

public interface IUserService {
	List<User> query(String[] names,Object[] values);
}
