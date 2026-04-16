package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] itemNames = new String[5];
		int[] prices = new int[5];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		for (int i = 0; i < 5; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください:>");
			itemNames[i] = br.readLine();
		}

		System.out.println("各商品の単価を順に入力してください");
		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の単価:>");
			str = br.readLine();
			prices[i] = Integer.parseInt(str);
		}

		System.out.println("\n登録商品一覧");

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "：" + prices[i] + "円");
		}

	}

}
