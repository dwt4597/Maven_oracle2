package com.biz.oracle.sql;

public class ScoreSumSQL {
	
	public static final String SS_All
	= " select * from view_score_sum ";
	
	public static final String SS_FIND_NUM
	= " select * from view_score_sum where st_num = #{st_num} ";
	
	public static final String SS_INSERT
	= " INSERT INTO tbl_score VALUES(#{id}, #{st_num}, #{st_sb_code}, #{sc_score}) " ;
}
