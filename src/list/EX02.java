package list;

import java.util.ArrayList;

public class EX02 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<String>();
	System.out.println("저장 전 size :"+arr.size() ); //arr.size는 몇개의 arr를 저장했냐 알려준다
	arr.add("111");
	arr.add("222");
	arr.add("333");
	System.out.println("저장 후 size :"+arr.size());
	for(int i=0;i<arr.size();i++) {
		String s = arr.get(i); //arr를 꺼내오는 코드
		System.out.println(i+"."+s);
	}
	System.out.println("-----for each----");
	//arr = ["111","222","333"]
	for( String ss : arr ) {
		System.out.println(ss);
		
	}
}
}









