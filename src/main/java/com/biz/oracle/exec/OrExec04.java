package com.biz.oracle.exec;

import java.util.*;

import com.biz.oracle.service.*;
import com.biz.oracle.vo.*;

public class OrExec04 {
	static Scanner scan;
	static StdService st;
	static ScoreService ss;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		st = new StdService();
		ss = new ScoreService();

		while (true) {
			int ret = infoView();

			switch (ret) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("학번 다시 입력ㄱ");
				break;

			case 9:
				System.out.println("조회 완료");
				break;

			}
			/*
			 * if (ret == 0) { System.out.println("Good Bye!!!"); break; } 
			 * if (ret == 1) {
			 * System.out.println("학번을 다시 입력하세요!!!");
			 * 
			 * } if (ret == 9) { System.out.println("학생정보와 점수 조회를 완료!!!"); }
			 */
		}
	}

	private static int infoView() {
		System.out.println("=================================");
		System.out.println("점수 조회");
		System.out.println("==================================");
		System.out.print("학번(0:종료) >>");
		String st_num = scan.nextLine();
		if (st_num.equals("0")) {
			System.out.println("종료선택");
			return 0;
		}
		// 학생정보 가져오기
		StdVO stVO = st.stdView(st_num);
		System.out.println("===================");
		System.out.println("학생정보");
		System.out.println("---------------");
		if (stVO != null) {
			System.out.println(stVO);
			System.out.println("===============");

		}

		else {
			System.out.println("학생정보 없슴!!!");
			System.out.println("================");
			return 1;
		}
		System.out.println("====================");
		// 점수 가져오기(리턴받은값)
		ScoreSumVO ssVO = ss.viewScoreSum(st_num);
		System.out.println("===================");
		System.out.println("점수정보");
		System.out.println("-------------------");
		if (ssVO != null) {
			System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\n", ssVO.getSs_kor(), ssVO.getSs_eng(), ssVO.getSs_math(),
					ssVO.getSs_sci(), ssVO.getSs_music());
		} else {
			System.out.println("점수정보 없슴!!!");
		}

		System.out.println("================================");
		return 9;

	}
}
