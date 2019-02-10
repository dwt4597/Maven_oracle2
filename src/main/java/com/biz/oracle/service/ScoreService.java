package com.biz.oracle.service;

import java.util.*;

import org.apache.ibatis.session.*;

import com.biz.oracle.dao.*;
import com.biz.oracle.db.*;
import com.biz.oracle.vo.*;

public class ScoreService {

	SqlSessionFactory sessionFactory;
	Scanner scan;

	public ScoreService() {

		OracleSqlFactory sqlFactory = new OracleSqlFactory();
		this.sessionFactory = sqlFactory.getSessionFactory();
		scan = new Scanner(System.in);
	}

	public ScoreSumVO viewScoreSum(String st_num) {
		SqlSession session = sessionFactory.openSession();
		ScoreSumDao dao = session.getMapper(ScoreSumDao.class);

		ScoreSumVO vo = dao.findStByNum(st_num);
		// System.out.println(vo);
		return vo;
	}

	public List<ScoreVO> viewScore(String st_num) {

		// DB로부터 값을 가져오기
		SqlSession session = this.sessionFactory.openSession();

		// Dao 받기
		ScoreDao dao = session.getMapper(ScoreDao.class);

		List<ScoreVO> scList = dao.findByStNum(st_num);
		for (ScoreVO vo : scList) {
			System.out.println(vo);
		}

		return scList;
	}

	public int insert(ScoreVO vo) {
		// DB로부터 값을 가져오기
		SqlSession session = this.sessionFactory.openSession();

		// Dao 받기
		ScoreDao dao = session.getMapper(ScoreDao.class);

		int ret = dao.insert(vo);
		session.commit();
		session.close();
		
		return ret;
	}

}
