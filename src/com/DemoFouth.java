package com;

import java.util.ArrayList;
import java.util.List;

public class DemoFouth{
	public static void main(String[] args) {
		DemoFouth demo = new DemoFouth();      
        //��ȡnums����
        List<String> num = demo.getList("dd");
        for(String str:num) {
        	 System.out.println(str);
        }      
	}
	/**
	 * ���<T> List<T> ���Դ����κ����͵�List
     * ����T:
     *     ��һ�� ��ʾ�Ƿ���
     *     �ڶ��� ��ʾ���ص���T���͵�����
     *     ������ ���Ʋ�������ΪT
	 * @param i
	 * @return
	 */
	private <T> List<T> getList(T i){
		List<T> nums = new ArrayList<T>();
		nums.add(i);nums.add(i);nums.add(i);		
		return nums;
	}
}
