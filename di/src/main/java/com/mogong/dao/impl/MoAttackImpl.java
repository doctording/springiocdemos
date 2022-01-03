package com.mogong.dao.impl;

import com.mogong.dao.MoAttack;
import com.mogong.model.Geli;

/**
 * 墨攻cityGateAsk剧本
 */
public class MoAttackImpl implements MoAttack {

	/**
	 * 剧本需要的角色
	 */
	private Geli geli;

	@Override
	public void cityGateAsk() {
        geli.responseAsk("墨者革离");
    }

	public Geli getGeli() {
		return geli;
	}

	public void setGeli(Geli geli) {
		this.geli = geli;
	}

}
