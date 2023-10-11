package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	public void DictionaryList(String[] searchStringArray) {

		HashMap<String, String> dictionary = new HashMap<String, String>();

		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

		for (String searchString : searchStringArray) {
			String output = null;
			for (String dictionaryKey : dictionary.keySet()) {
				if (searchString.equals(dictionaryKey)) {
					output = dictionaryKey + "の意味は" + dictionary.get(dictionaryKey) + "です";
					break;
				} else {
					output = "辞書に存在しません";
				}
			}
			System.out.println(output);
		}
	}

}
//apple	りんご
//peach	桃
//banana	バナナ
//lemon	レモン
//pear	梨
//kiwi	キウィ
//strawberry	いちご
//grape	ぶどう
//muscat	マスカット
//cherry	さくらんぼ
