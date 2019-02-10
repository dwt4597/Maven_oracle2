package com.biz.oracle.service;

import java.util.*;

import javax.sql.*;

import org.apache.ibatis.datasource.*;
import org.apache.ibatis.mapping.*;
import org.apache.ibatis.session.*;
import org.apache.ibatis.transaction.*;
import org.apache.ibatis.transaction.jdbc.*;

import com.biz.oracle.dao.*;
import com.biz.oracle.db.*;
import com.biz.oracle.vo.*;

public class StdService {
	SqlSessionFactory sessionFactory;
	Scanner scan;
	public StdService() {
		OracleSqlFactory sqlFactory = new OracleSqlFactory();
		this.sessionFactory = sqlFactory.getSessionFactory();
		scan = new Scanner(System.in);
	}

	public void insert() {
		StdVO vo = stdInfoInput();
		if (vo == null)
			return;

		SqlSession session = sessionFactory.openSession();
		StdDao dao = session.getMapper(StdDao.class);
		int ret = dao.insert(vo);
		session.commit();
		session.close();
		if (ret > 0) {
			System.out.println("추가 성공!!!");

		} else {
			System.out.println("추가 실패...");
		}
	}

	public void update() {
		StdVO vo = stdInfoInput();
		if (vo == null)
			return;

		SqlSession session = sessionFactory.openSession();
		StdDao dao = session.getMapper(StdDao.class);
		int ret = dao.update(vo);
		session.commit();
		session.close();
		if (ret > 0) {
			System.out.println("추가 성공!!!");

		} else {
			System.out.println("추가 실패...");
		}
	}

	private StdVO stdInfoInput() {
		
		System.out.print("학성정보 입력(학번(0 :종료), 이름, 학년, 전화번호) >>");
		String st_number = scan.nextLine();
		if (st_number.equals("0")) {
			return null;
		}
		String st_name = scan.nextLine();
		String st_grade = scan.nextLine();
		String st_tel = scan.nextLine();
		StdVO vo = new StdVO();
		vo.setSt_number(st_number);
		vo.setSt_name(st_name);
		vo.setSt_grade(st_grade);
		vo.setSt_tel(st_tel);
		return vo; // ?
	}
	// SqlSession session = this.sessionFactory.openSession();
	// StdDao dao = session.getMapper(StdDao.class);
	// int intreturn = dao.insert(vo);
	// System.out.println(vo);
	// if(intreturn > 0) {
	// System.out.println("잘됨");
	// } else if(intreturn < 0) {
	// System.out.println("insert안된듯");
	// }
	// session.commit();
	// session.close();
	// }

	public void stdView() {
		// TODO Auto-generated method stub
		SqlSession session = this.sessionFactory.openSession();
		StdDao dao = session.getMapper(StdDao.class);

		List<StdVO> stdList = dao.selectAll();

		for (StdVO vo : stdList) {
			System.out.println(vo);
		}
	}

	public StdVO stdView(String st_num) {
		// TODO Auto-generated method stub
		SqlSession session = this.sessionFactory.openSession();
		StdDao dao = session.getMapper(StdDao.class);
		
		StdVO vo = dao.findByNum(st_num);
		return vo;
	}
}