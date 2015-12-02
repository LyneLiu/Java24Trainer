package com.lyne.framedemo;

import java.util.Date;

/**
 * 一个获取随机语句集的示例，作为一个小的demo。
 * 如果从大数据的角度进行分析的话，本质上，所有的数据获取之后，
 * 然后就可以通过适当的算法获取相对应的数据进行处理获取到结果。
 * @author nn_liu
 *
 */
public class PhraseOMatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 语义集
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
		// 语义长度
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// 语义数据集中随机获取一个语义组合成为语句
		int rand1 = (int)(Math.random() * oneLength);
		int rand2 = (int)(Math.random() * twoLength);
		int rand3 = (int)(Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println(phrase);
		
	}

}
