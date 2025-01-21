package com.mru.oops1;

public class SubtractionImpl extends AdditionImpl implements SubtractionInterface {

	@Override
	public void sub1() {
		public void add1() {
			int num1 = 100;
			int num2 = 200;
			int res = num1 - num2;
			System.out.println(res);
	}

	@Override
	public void sub2(int num1, int num2) {
		int res = num1 - num2;
		System.out.println(res);
		
	}

	@Override
	public int sub3() {
		int num1 = 100;
		int num2 = 200;
		int res = num1+ num2;
		return res ;
	
	}

	@Override
	public int sub4(int num1, int num2) {
		int res = num1 - num2;
		return res;
	}

}
