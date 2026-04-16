package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

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

		// int型変数totalPricesを初期値0で初期化
		int totalPrices = 0;

		// 購入数の入力及び合計金額の計算
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数:>");
			str = br.readLine();
			amounts[i] = Integer.parseInt(str);
			totalPrices = totalPrices + prices[i] * amounts[i];
		}

		// 割引前の金額を出力
		System.out.println("割引前合計：" + totalPrices + '円');

		// 合計金額が5000円以上の時、10%割引し出力
		if (totalPrices >= 5000) {
			totalPrices = (int) (totalPrices * 0.9);
			System.out.println("割引適用（10%OFF）：" + totalPrices + '円');
		} else {
			System.out.println("割引なし");
		}

		System.out.println("税込合計：" + (int) (totalPrices * 1.1) + '円');
	}

}
