package com.biz.oracle.vo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreSumVO {
	private String st_num;
	private int ss_kor;
	private int ss_eng;
	private int ss_math;
	private int ss_sci;
	private int ss_music;

}