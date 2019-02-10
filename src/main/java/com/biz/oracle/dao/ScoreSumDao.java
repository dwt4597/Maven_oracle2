package com.biz.oracle.dao;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.biz.oracle.sql.*;
import com.biz.oracle.vo.*;

public interface ScoreSumDao {
	@Select(ScoreSumSQL.SS_All)
	public List<ScoreVO> selectAll();
	
	@Select(ScoreSumSQL.SS_FIND_NUM)
	public ScoreSumVO findStByNum(String st_num);
	
}
