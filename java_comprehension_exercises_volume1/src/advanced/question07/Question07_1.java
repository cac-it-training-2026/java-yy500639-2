package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		// String型配列のitemsNameとint型配列pricesの作成
		String[] itemNames = new String[5];
		int[] prices = new int[5];

		// 入力の準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		// 商品名の入力
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください:>");
			itemNames[i] = br.readLine();
		}

		// 各商品の単価を入力
		System.out.println("各商品の単価を順に入力してください");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の単価:>");
			str = br.readLine();
			prices[i] = Integer.parseInt(str);
		}

		// 登録商品と単価を一覧表示
		System.out.println("\n登録商品一覧");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + '：' + prices[i] + '円');
		}

	}

}
