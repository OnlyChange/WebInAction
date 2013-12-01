package cn.lmn.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.lmn.dao.IGenericDao;

public class GenericDaoImpl<T,PK extends Serializable> implements IGenericDao<T, PK> {
	private SessionFactory sessionFactory;
	@Override
	public List<T> query(String hql, String[] names, Object[] values) {
		Query query = sessionFactory.openSession().createQuery(hql);
		if(names!=null)
		{
			int len = names.length;
			for(int i=0;i<len;i++)
			{
				query.setParameter(names[i], values[i]);
			}
		}
		return query.list();
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
