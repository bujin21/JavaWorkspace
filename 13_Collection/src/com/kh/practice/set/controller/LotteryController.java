package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		// 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		// 전달 받은 l을 lottery에서 삭제
		// 당첨자 목록(win) 중에 삭제된 추첨 대상자가 존재할 수 있으니
		// 삭제 결과인 boolean 값과 win객체가 null이 아닐 때에만
		// win에도 해당 추첨 대상자 삭제
		boolean b = lottery.remove(l);
		if(b &&  win == null) {
			win.remove(l);
		}
		return b;
	}
	public HashSet winObject() {
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
		// 인덱스를 이용해 win에 당첨자 저장
		// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
		List<Lottery> list = new ArrayList<>(lottery);
		Collections.shuffle(list); // 데이터 섞어주기
		if(list.size() < 4) {
			return null;
		}
		
		for(int i=0; win.size()<4; i++) {
			win.add(list.get(i));
		}
//		boolean b = false;
//		if(list.size() >= 4) {
//			for(int i=0; i<list.size(); i++) {
//				int ran = (int)(Math.random() * list.size());
//				if(!(win.size() == 4)) {
//					b=win.add(list.get(ran));
//				}else {
//					break;
//				}
//				if(!b) i--;
//			}
//		}
		
		return win;
	}
	public TreeSet<Lottery> sortedWinObject() {
		winObject(); // 당첨자 목록 채우기
		TreeSet<Lottery> set = new TreeSet<>(new SortedLottery());
		set.addAll(win);
		
		return set;
	}
	public boolean searchWinner(Lottery l) {
		// 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환
		
		return win.contains(l);
	}
	
}
