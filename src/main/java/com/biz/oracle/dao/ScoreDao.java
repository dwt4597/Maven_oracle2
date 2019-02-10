package com.biz.oracle.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.biz.oracle.db.*;
import com.biz.oracle.sql.*;
import com.biz.oracle.vo.*;

public interface ScoreDao {
	@Select (ScoreSQL.SC_ALL)
	public List<ScoreVO> selectAll();
	
	@Select (ScoreSQL.SC_FIND_ID)
	public ScoreVO findById(long id);
	
	@Select (ScoreSQL.SC_FIND_NUM)
	public List<ScoreVO> findByStNum(String st_num);

	@Insert (ScoreSQL.SC_INSERT)
	public int insert(ScoreVO vo);

	@Update (ScoreSQL.SC_UPDATE)
	public int update(ScoreVO vo);

	@Delete(ScoreSQL.SC_DELETE)
	public int delete(long id);
}
