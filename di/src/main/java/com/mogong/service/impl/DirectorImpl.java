package com.mogong.service.impl;

import com.mogong.dao.MoAttack;
import com.mogong.service.Director;

/**
 * 导演类
 */
public class DirectorImpl implements Director {
	
	// 注入剧本
	MoAttack moAttack;

	@Override
	public void direct(){
		System.out.println("剧本开始....");
		moAttack.cityGateAsk();
		System.out.println("剧本结束");
   }

	public MoAttack getMoAttack() {
		return moAttack;
	}

	public void setMoAttack(MoAttack moAttack) {
		this.moAttack = moAttack;
	}  
	
}
