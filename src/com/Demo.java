package com;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Demo demo = new Demo();

        //��ȡstring����
        List<String> array = new ArrayList<String>();
        array.add("test");
        array.add("doub");
        String str = demo.getListFirst(array);
        System.out.println(str);
        //
        
        //��ȡnums����
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(13);
        Integer num = demo.getListFirst(nums);
        System.out.println(num);

	}
	/**
	 *  ���<T> T ���Դ����κ����͵�List
     *  ����T
     *     ��һ�� ��ʾ�Ƿ���
     *     �ڶ��� ��ʾ���ص���T���͵�����
     *     ������ ���Ʋ�������ΪT
	 * @param data
	 * @return
	 */
	private <T> T getListFirst(List<T> data) {
		if (data == null || data.size() == 0) {
			return null;
	    }
		return data.get(0);
	}
}
