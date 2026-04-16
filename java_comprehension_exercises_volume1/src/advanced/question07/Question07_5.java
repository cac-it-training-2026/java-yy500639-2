package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int totalPrices = 0;
		int[] priceWithTax = new int[itemNames.length];

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			str = br.readLine();
			amounts[i] = Integer.parseInt(str);
			priceWithTax[i] = (int) (prices[i] * 1.1);
			totalPrices = totalPrices + priceWithTax[i] * amounts[i];
		}

		System.out.println("購入内容一覧：");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：単価" + prices[i] + "円（税込" + priceWithTax[i] + "円）×" + amounts[i] + "個 = "
					+ (priceWithTax[i] * amounts[i]) + '円');
		}
		System.out.println("合計（税込）：" + totalPrices + '円');

		if (totalPrices >= 5000) {
			System.out.println("割引後合計（税込）：" + (int) (totalPrices * 0.9) + '円');
		}
	}
}