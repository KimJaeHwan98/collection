package list;
//추가하는 만큼 공간이 저장된다.
import java.util.ArrayList;

public class Ex01 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	arr.add("안녕"); //0
	arr.add("하세요");
	arr.add("하세요");
	arr.add("하세요");
	arr.add("하세요");
	arr.add("하세요"); //5
	System.out.println("arr :"+arr);
	
	String s = arr.get(0);
	System.out.println("0 :"+s);
}
}
