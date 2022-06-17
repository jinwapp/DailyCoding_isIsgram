// 문제 :
//        문자열을 입력받아 아이소그램인지 여부를 리턴해야 합니다. 아이소그램(isogram)은 각 알파벳을 한번씩만 이용해서 만든 단어나 문구를 말합니다.
// 주의사항 :
//        빈 문자열을 입력받은 경우, true를 리턴해야 합니다.
//        대소문자는 구별하지 않습니다.
// 입출력 예시 :
//        boolean output = isIsogram("aba");
//        System.out.println(output); // false
//
//        output = isIsogram("Dermatoglyphics");
//        System.out.println(output); // true
//
//        output = isIsogram("moOse");
//        System.out.println(output); // false

import java.util.HashSet;

public class DailyCoding_isIsogram {
    public static void main(String[] args) {

        // String을 모두 소문자로 만든다.
        String str = ("dropOut");
        str = str.toLowerCase();

        // HashSet을 만든다.
        HashSet<Character> hashSet = new HashSet<>();

        // for ( 0 ~ length-1까지)
        for (int i=0; i<str.length(); i++) {
            // if charAt[i]가 hashSet에 포함되어 있다면
            if (hashSet.contains(str.charAt(i))) {
                // return false
                System.out.println("false");
            // 그렇지 않다면
            } else {
                // hash.add( )
                hashSet.add(str.charAt(i));
            }
        }
        //return true
        System.out.println("true");
    }
}
