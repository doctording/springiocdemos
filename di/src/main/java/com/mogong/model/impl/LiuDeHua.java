package com.mogong.model.impl;

import com.mogong.model.Geli;

/**
 * 演员：刘德华
 * @Author mubi
 * @Date 2022/1/15 12:04
 */
public class LiuDeHua extends Geli {

	@Override
	public void responseAsk(String content){
		System.out.println("LiuDeHua:" + content);
	}
	
}
