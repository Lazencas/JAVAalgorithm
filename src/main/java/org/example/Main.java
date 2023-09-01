package org.example;

//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
//예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
//자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.


public class Main {
    public boolean solution(int x){
        boolean answer = true;
        //숫자의 자릿수를 구한다
        String str = Integer.toString(x);
        int [] number = new int[str.length()];
        for(int i=0; i<str.length();i++){
            number[i]=str.charAt(i)-'0';
        }
        //자릿수의 합으로 x가 나누어지는지 판단한다.
        //모든 자릿수의 합을 담을 인트 변수 y선언
        int y =0;
        for(int i =0; i<number.length; i++){
            y += number[i];
        }

        if(x%y==0){
           answer = true;
        }else {
            answer = false;
        }
        //나누어 떨어지면 true를 반환 아니면 false를 반환한다 ;
        return answer;
    }
    public static void main(String[] args) {
          Main main = new Main();
        System.out.println(main.solution(10));
        System.out.println(main.solution(12));
        System.out.println(main.solution(11));
        System.out.println(main.solution(13));



    }
}