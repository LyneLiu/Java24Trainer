package com.lyne.framedemo;

import java.util.Date;

/**
 * һ����ȡ�����伯��ʾ������Ϊһ��С��demo��
 * ����Ӵ����ݵĽǶȽ��з����Ļ��������ϣ����е����ݻ�ȡ֮��
 * Ȼ��Ϳ���ͨ���ʵ����㷨��ȡ���Ӧ�����ݽ��д����ȡ�������
 * @author nn_liu
 *
 */
public class PhraseOMatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���弯
		String[] wordListOne = new String[]{"24/7","multiTier","30,000 foot",
				"B-to-B","win-win","frontend", "web-based","pervasive", 
				"smart", "sixsigma","critical-path", "dynamic"};
		
		String[] wordListTwo = new String[]{"empowered", "sticky",
				"value-added", "oriented", "centric", "distributed",
				"clustered", "branded","outside-the-box", "positioned",
				"networked", "focused", "leveraged", "aligned",
				"targeted", "shared", "cooperative", "accelerated"};
		
		String[] wordListThree = new String[]{"process", "tippingpoint", "solution", "architecture", "core competency",
				"strategy", "mindshare", "portal", "space", "vision",
				"paradigm", "mission"};
		// ���峤��
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// �������ݼ��������ȡһ��������ϳ�Ϊ���
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println(phrase);
		
	}

}
