package com.biz.oracle.exec;

import java.util.*;

import com.biz.oracle.service.*;
import com.biz.oracle.vo.*;

public class OrExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScoreService ss = new ScoreService();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학번 입력 >>");
		String st_num = scan.nextLine();
		
		List<ScoreVO> scL = ss.viewScore(st_num);
		for(ScoreVO vo : scL) {
			System.out.println(vo);
		}
	}

}
