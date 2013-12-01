package cn.lmn.dao.impl;
import org.springframework.stereotype.Repository;
import cn.lmn.dao.IUserDao;
import cn.lmn.entity.User;
@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User,Long> implements IUserDao {

}
