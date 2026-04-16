package basic.question05;

import java.io.IOException;

/**
 * 第8章 条件分岐
 */

public class Question05_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		int[] numberGroup = { 3, 5, 7, 9 };

		if (numberGroup[3] == 3) {
			System.out.println("４番目の要素の値は３です。");
		} else if (numberGroup[3] == 5) {
			System.out.println("４番目の要素の値は５です。");
		} else if (numberGroup[3] == 7) {
			System.out.println("４番目の要素の値は７です。");
		} else {
			System.out.println("４番目の要素の値は３，５，７以外の値です。");
		}

	}
}
