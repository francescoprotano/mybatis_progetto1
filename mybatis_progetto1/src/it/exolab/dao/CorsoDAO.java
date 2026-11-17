package it.exolab.dao;

import it.exolab.mapper.CorsoMapper;
import it.exolab.model.Corso;
import it.exolab.util.MyBatisUtils;

public class CorsoDAO {
	public void insert(Corso model) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		CorsoMapper theMapper = session.getMapper(CorsoMapper.class);
	    theMapper.insert(model);
	    session.commit();
	}
}
