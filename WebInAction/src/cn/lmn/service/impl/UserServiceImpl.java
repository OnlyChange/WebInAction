package cn.lmn.service.impl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.lmn.dao.IUserDao;
import cn.lmn.entity.User;
import cn.lmn.service.IUserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
	private IUserDao userDao;
	@Override
	public List<User> query(String[] names, Object[] values) {
		return userDao.query("from User", names, values);
	}
	@Resource
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
}
