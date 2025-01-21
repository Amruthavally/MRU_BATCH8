package com.mru.oops;

import com.mru.day7.GrandParent;

public class Parent extends GrandParent implements ParentInterface {

	@Override
	public void m2(String str) {
		System.out.println("Welcome to "+str);
	}

}
