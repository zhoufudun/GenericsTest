package com;

import java.util.ArrayList;
import java.util.List;

public class DemoThree<T>{
	public static void main(String[] args) {
		DemoThree<String> demo = new DemoThree<String>();      
        //��ȡnums����
        List<String> num = demo.getList("dd");
        for(String str:num) {
        	 System.out.println(str);
        }      
	}
	/**
	 * ���ص�List�е�������DemoThreeʵ�������������
	 * @param i
	 * @return
	 */
	private List<T> getList(T i){
		List<T> nums = new ArrayList<T>();
		nums.add(i);nums.add(i);nums.add(i);		
		return nums;
	}
}
