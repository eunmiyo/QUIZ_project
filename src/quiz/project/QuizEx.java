package quiz.project;

import java.util.Scanner;

public class QuizEx { 
	
	public static void main(String[] args) {	
		
		QuizGame quizGame = new QuizGame();
		
		boolean run = true;
		
		while(run) {
			System.out.println();
			System.out.println();
			System.out.println(" +=========================Mini Quzi=============================+");
			System.out.println(" |   1.스포츠  |   2.음악  |   3.상식  |   4.넌센스  |   5.영화  |");
			System.out.println(" +===============================================================+");
			System.out.println();
			System.out.println("퀴즈번호를 선택해 주세요!");
			
			String key = getInput("퀴즈번호-> ");
			if("1".equals(key)) {
				quizGame.start(quizGame.SPORT);
			} else if ("2".equals(key)) {
				quizGame.start(quizGame.MUSIC);
			} else if ("3".equals(key)) {
				quizGame.start(quizGame.COMMONSENSE);
			} else if ("4".equals(key)) {
				quizGame.start(quizGame.NONSENSE);
			} else if ("5".equals(key)) {
				quizGame.start(quizGame.MOVIE);
			} else {
				System.err.println("[오류] 보기에 없는 숫자를 입력했습니다." + key);
				System.err.println("[오류] 퀴즈 풀 자격이 없습니다.");
				System.err.println("[오류] 종료합니다.");
				run = false;
			}
		}
	

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
}
