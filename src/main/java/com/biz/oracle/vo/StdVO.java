package com.biz.oracle.vo;

import lombok.*;

/*
 *  st_number char(5) primary key,
    st_name nvarchar2(20) not null,
    st_grade char(2),
    st_tel nvarchar2(20)
 */
@Data //전체
//@Getter //getter만
//@Setter //setter만
//@ToString //toString만
//@Builder //생성자만

/*
 * 멤버변수 초기화 생성자를 만들고
 * 기본생성자는 감춰버린다.
 * @Builder
 */
@AllArgsConstructor //멤버변수 생성자
@NoArgsConstructor //기본 super 생성자
public class StdVO {
	private String st_number;
	private String st_name;
	private String st_grade;
	private String st_tel;
	// number = long으로
	// 나머지 = String
	
}
