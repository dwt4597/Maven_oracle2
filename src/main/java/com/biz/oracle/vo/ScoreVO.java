package com.biz.oracle.vo;

import lombok.*;
/*
 * lombok 플러그인을 eclpase에 설치해서
 * VO 클래스의 getter setter 생성자 toString 등의
 * 작성을 대신 하도록 만들었다.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreVO {
	private long id;
	private String st_num;
	private String st_sb_code;
	private int sc_score;

	
}
