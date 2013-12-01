package cn.lmn.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T,PK extends Serializable> {
	List<T> query(String hql,String[] names,Object[] values);
}
