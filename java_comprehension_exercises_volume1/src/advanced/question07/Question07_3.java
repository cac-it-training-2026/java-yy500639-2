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
		// 入力の準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		// int型変数totalPriceを初期値0で初期化
		int totalPrice = 0;

		// int型配列stocksを作成
		int[] stocks = new int[itemNames.length];

		// 在庫数の入力及び保存
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の在庫数:>");
			str = br.readLine();
			stocks[i] = Integer.parseInt(str);
		}

		// 購入数の入力、在庫数を上回った場合は再度入力
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			str = br.readLine();
			amounts[i] = Integer.parseInt(str);
			if (stocks[i] < amounts[i]) {
				System.out.println("在庫を超えています。もう一度入力してください。");
				i--;
			}
		}

		// 購入数を一覧表示
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：購入" + amounts[i] + '個');
			System.out.println("在庫" + stocks[i] + '個');
			totalPrice = totalPrice + prices[i] * amounts[i];
		}

		// 合計金額を出力
		System.out.println("合計金額：" + totalPrice + '円');

	}
}
