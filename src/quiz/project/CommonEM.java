package quiz.project;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

/**
 * 은미의 메모장
 * @author choco
 * 
 * 문자열 비교 시 NullpointException 안나오게 하기 위해서는
 * 왼쪽에 Null 객체가 오지 않게 한다
 * ex)
 * String val = null;
 * if ("문자열".equals(val)) { }
 * "문자열" -> 문자열 객체, null이 아니다
 * 
 * 문자열 비교 메소드
 * equals : 문자열 비교
 * equalsIgnore : 영문 대소문자 무시하고 비교
 * 
 * 숫자 비교
 * 부등호
 * 
 * 이렇게 지식이 올랐다
 * 
 * 
 * Exception 해결방법
 * 
 * Duplicate local variable 변수명
 * 변수명이 중복으로 선언되었다
 * 
 */

public class CommonEM {
	/**
	 * 현재일시반환
	 * @return yyyy-MM-dd HH:mm:ss 형식에 맞는 현재일시
	 */
	public static String today() {
		return today("yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * 현재일시반환
	 * @param pattern date형식
	 * @return date형식에 맞는 현재일시
	 */
	
	public static String today(String pattern) {
		//Date today = new Date();
		//Locale currentLocale = new Locale("KOREAN", "KOREA");
		//SimpleDateFormat formatter = new SimpleDateFormat(pattern, currentLocale);
		
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(timeZone);
		Date today = calendar.getTime();
		
		return formatter.format(today);
	}
	
	/**
	 * 문자열로 변환
	 * @param obj
	 * @return
	 */
	public static String toString(Object obj) {
		if (null == obj) {
			return "";
		} else if (obj instanceof Object[]) {
			return Arrays.toString((Object[]) obj);
		} else if (obj instanceof Integer) {
			return Integer.toString((int) obj);
		} else if (obj instanceof Long) {
			return Long.toString((long) obj);
		} else if (obj instanceof Float) {
			return Float.toString((float) obj);
		} else {
			return obj.toString();
		}
	}
	
	/**
	 * 출력 -> 다음 줄 이동
	 * @param obj 출력할 값
	 */
	public static void println(Object obj) {
		System.out.println(toString(obj));
	}
	
	/**
	 * 다음 줄 이동 -> 출력 -> 다음 줄 이동
	 * @param obj 출력할 값
	 */
	public static void printfrln(Object obj) {
		System.out.println();
		println(obj);
	}
	
	/**
	 * 출력 -> 다음 줄 이동하지 않는다
	 * @param obj 출력할 값
	 */
	public static void print(Object obj) {
		System.out.print(toString(obj));
	}
	
	/**
	 * 다음 줄 이동 -> 출력 -> 다음 줄 이동하지 않는다
	 * @param obj 출력할 값
	 */
	public static void printfr(Object obj) {
		System.out.println();
		print(obj);
	}
	
	/**
	 * 사용자 입력받은 값을 반환한다
	 * @param val 입력받기 전에 앞에 출력할 값
	 * @return
	 */
	public static String getInput(String val) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(val);
		return scanner.nextLine();
	}
	
	public static void main(String[] args) {
		System.out.println("현재 시간은 " + today() + " 입니다");
		System.out.println("현재 시간은 " + today("yyyy") + "년 입니다");
	}
}
