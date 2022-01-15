package com.mogong.model.impl;

import com.mogong.model.Geli;

/**
 * 其它演员
 * @Author mubi
 * @Date 2022/1/15 12:04
 */
public class Other extends Geli {

	@Override
	public void responseAsk(String content){
		System.out.println("Other Actor:" + content);
	}
	
}
