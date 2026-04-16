package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int sumPrices = 0;

		int[] stocks = new int[itemNames.length];

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の在庫数:>");
			str = br.readLine();
			stocks[i] = Integer.parseInt(str);
		}

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			str = br.readLine();
			amounts[i] = Integer.parseInt(str);
			if (stocks[i] < amounts[i]) {
				System.out.println("在庫を超えています。もう一度入力してください。");
				i--;
			}
		}

		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：購入" + amounts[i] + "個");
			System.out.println("在庫" + stocks[i] + "個");
			sumPrices = sumPrices + prices[i] * amounts[i];
		}

		System.out.println("合計金額：" + sumPrices + "円");

	}
}
