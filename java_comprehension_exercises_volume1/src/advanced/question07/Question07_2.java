package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };

		// TODO: 実装ここから
		// 入力の準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		// int型配列のamountsとint型配列のtotalPriceを作成
		int[] amounts = new int[itemNames.length];
		int totalPrice = 0;

		// 各商品の購入数の入力
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			str = br.readLine();
			amounts[i] = Integer.parseInt(str);
			totalPrice = totalPrice + (prices[i] * amounts[i]);
		}

		// 各商品の購入金額を表示
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + '：' + (prices[i] * amounts[i]) + '円');
		}

		// 合計金額を表示
		System.out.println("合計金額：" + totalPrice + '円');
	}
}
