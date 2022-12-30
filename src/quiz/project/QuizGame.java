package quiz.project;

import java.util.ArrayList;
import java.util.List;

public class QuizGame {
	public final int SPORT = 1;
	public final int MUSIC = 2;
	public final int COMMONSENSE = 3;
	public final int NONSENSE = 4;
	public final int MOVIE = 5;
	
	private List<PopQuizVO> popQuizList; // 문제 저장공간
	private List<String> user; // 사용자입력
	private int count = 0; // 정답갯수

	public void start(int quizType) {
		CommonEM.getInput("준비가 되셨다면 Enter 키 입력-> ");

		// System.out.println("sport: " + enter);

		init();
		
		switch (quizType) {
		case SPORT : 
			quizSport();
			break;
		case MUSIC :
			quizMusic();
			break;
		case COMMONSENSE :
			quizCommonsense();
			break;
		case NONSENSE :
			quizNonsense();
			break;
		case MOVIE :
			quizNonsense();
			break;
		default :
			quizMovie();
			break;
		}

		test();
		
		compare();

		System.out.println("정답 수 ===> " + count + "개");
	}

	/**
	 * 초기화
	 */
	public void init() {
		count = 0; //정답개수 초기화
	}
	
	public void quizSport() {
		popQuizList = new ArrayList<PopQuizVO>();
		
		PopQuizVO popQuizVo = null;
		String quizType = "스포츠";
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("야구에서 선발투수가 한 명의 타자도 1루에 내보내지 않는 경기를 뜻하는 이 말은 무엇일까요?");
		popQuizVo.setAnswer("퍼펙트게임");
		popQuizVo.setHint("글자수=5, 초성=ㅍㅍㅍㄱㅇ");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("원래 이름이 '핑퐁'이었던 스포츠는");
		popQuizVo.setAnswer("탁구");
		popQuizVo.setHint("글자수=2, 초성=ㅌㄱ");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("배구는 한 팀이 몇명으로 구성되어 있는가?");
		popQuizVo.setAnswer("6");
		popQuizVo.setHint("세터, 레프트2, 센터2, 라이트 포지션이 있습니다.");
		popQuizList.add(popQuizVo);
		
		CommonEM.printfrln(quizType + " 관련 문제입니다! 총 " + popQuizList.size() + " 문제를 맞춰주세요!");
	}
	
	public void quizMusic() {
		popQuizList = new ArrayList<PopQuizVO>();
		
		PopQuizVO popQuizVo = null;
		String quizType = "음악";
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("아이브, 르세라핌, 블랙핑크 멤버 수를 합치면 몇 명인가요? ");
		popQuizVo.setAnswer("15");
		popQuizVo.setHint("아이브는6명, 르세라핌은5명, 블랙핑크는 4명");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion(" Attention, Hype boy, Cookie 를 부른 여자아이돌 그룹명은?  ");
		popQuizVo.setAnswer("뉴진스");
		popQuizVo.setHint("ㄴ ㅈ ㅅ");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion(" 뽀뽀뽀 노래에서 뽀뽀뽀 단어는 몇 번 들어갈까요?  ");
		popQuizVo.setAnswer("8");
		popQuizVo.setHint("아빠가 출근할 때 뽀뽀뽀 "
				+ "\n"
				+ "엄마가 안아줘도 뽀뽀뽀 "
				+ "\n"
				+ "만나면 반갑다고 뽀뽀뽀 "
				+ "\n"
				+ "헤어질 때 또 만나요 뽀뽀뽀 "
				+ "\n"
				+ "우리는 귀염둥이 뽀뽀뽀 친구 "
				+ "\n"
				+ "뽀뽀뽀 뽀뽀뽀 뽀뽀뽀 친구");
		popQuizList.add(popQuizVo);
		
		
		CommonEM.printfrln(quizType + " 관련 문제입니다! 총 " + popQuizList.size() + " 문제를 맞춰주세요!");
	}
	
	public void quizCommonsense() {
		popQuizList = new ArrayList<PopQuizVO>();
		
		PopQuizVO popQuizVo = null;
		String quizType = "상식";
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("타인의 기대나 관심으로 인하여 능률이 오르거나 결과가 좋아지는 현상은?");
		popQuizVo.setAnswer("피그말리온");
		popQuizVo.setHint("ㅍㄱㅁㄹㅇ효과");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("어떤 상황에 처음 처했을 때 이 상황과 같은 경험을 이전에도 경험했었다는 기분이 드는 순간을 데자뷰라고 합니다. "
				+ "반대로 늘상 경험하는 일인데도 불구하고 처음 경험하고, 처음 보는 것 같은 느낌을 무슨 현상이라고 할까요?");
		popQuizVo.setAnswer("뷰자데");
		popQuizVo.setHint("데자뷰의 반대말");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("태국의 수도는?");
		popQuizVo.setAnswer("방콕");
		popQuizVo.setHint("ㅂㅋ");
		popQuizList.add(popQuizVo);
		
		CommonEM.printfrln(quizType + " 관련 문제입니다! 총 " + popQuizList.size() + " 문제를 맞춰주세요!");
	}
	
	public void quizNonsense() {
		popQuizList = new ArrayList<PopQuizVO>();
		
		PopQuizVO popQuizVo = null;
		String quizType = "넌센스";
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("알파벳은 모두 몇 자 일까요? 숫자만 적어주세요!");
		popQuizVo.setAnswer("3");
		popQuizVo.setHint("알.파.벳");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion(" 물고기의 반대말은? ");
		popQuizVo.setAnswer("불고기");
		popQuizVo.setHint("물 반대!");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion(" 당신이 달리기 시합에서 2등을 제쳤다 그럼 몇 등인가? 숫자만 적어주세요! ");
		popQuizVo.setAnswer("2");
		popQuizVo.setHint(" 천천히 생각해 봐요 2등을 제쳤어요!! 그럼 몇 등? ");
		popQuizList.add(popQuizVo);
		
		CommonEM.printfrln(quizType + " 관련 문제입니다! 총 " + popQuizList.size() + " 문제를 맞춰주세요!");
	}
	
	/**
	 * 영화 문제 만들기
	 */
	public void quizMovie() {
		popQuizList = new ArrayList<PopQuizVO>();
		
		PopQuizVO popQuizVo = null;
		String quizType = "영화";
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("세계 3대 영화제에 속하지 않는 영화제는? 1.칸 2.아카데미 3.베를린 4.베니스 몇 번?");
		popQuizVo.setAnswer("2");
		popQuizVo.setHint("프랑스 칸, 이탈리아 베니스, 독일 베를린, 미국 아카데미는 속하지 않는다!");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("(경찰, 치킨, 천만관객) 다음 단어들과 연관있는 영화 제목은? ");
		popQuizVo.setAnswer("극한직업");
		popQuizVo.setHint("'지금까지 이런맛은 없었다~' ㄱㅎㅈㅇ");
		popQuizList.add(popQuizVo);
		
		popQuizVo = new PopQuizVO();
		popQuizVo.setQuestion("[초성퀴즈] 영화 제목을 맞춰주세요 ㅂㅈㄷㅅ");
		popQuizVo.setAnswer("범죄도시");
		popQuizVo.setHint("장르는 범죄, 천만관객, 마동석");
		popQuizList.add(popQuizVo);
		
		CommonEM.printfrln(quizType + " 관련 문제입니다! 총 " + popQuizList.size() + " 문제를 맞춰주세요!");
	}

	public void test() {
		// 타이머 쓰레드 선언
		Time t = new Time();
		// 타이머 시작
		t.start();
		
		int maxhintcount = 1;
		int hintcount = 0;
		
		PopQuizVO popQuizVo = null;
		
		user = new ArrayList<String>();
		
		for (int i = 0; i < popQuizList.size(); i++) {
			popQuizVo = popQuizList.get(i);
			
			CommonEM.printfrln((i + 1) + ". " + popQuizVo.getQuestion()); //문제 출력
			
			System.out.println();
			String input = CommonEM.getInput("정답-> "); //정답 입력
			
			//힌트를 입력했을 경우
			while("힌트".equals(input)) {
				if (hintcount == 0) { //힌트 사용 한 적이 없다
					hintcount++;
					CommonEM.printfrln("힌트 [남은 개수=" + (maxhintcount - hintcount) + "] ===> " + popQuizVo.getHint()); //힌트 출력
				} else { //힌트 사용 한 적이 있다
					CommonEM.printfrln("힌트 [남은 개수=" + (maxhintcount - hintcount) + "] ===> 삐빅! 힌트를 너무 남발하시네요. 더 이상 당신에게 줄 힌트는 없습니다.");
				}
				
				System.out.println();
				input = CommonEM.getInput("정답-> "); //정답 입력
			}
			
			user.add(input);
		}
		//System.out.println("사용자 입력값: " + CommonEM.toString(user));

		// 타이머 종료
		// 경과 시간 출력
		CommonEM.printfrln("문제 푼 시간 ===> " + t.endTimer() + "초");
		CommonEM.printfrln("힌트 사용 개수 ===> " + hintcount);
	}

	public void compare() {
		//System.out.println("Compare");
		
		PopQuizVO popQuizVo = null;
		String temp = null;
		
		for (int i = 0; i < popQuizList.size(); i++) {
			popQuizVo = popQuizList.get(i);
			temp = user.get(i);
			
			if (temp.equals(popQuizVo.getAnswer())) {
				count++;
			}
		}
	}
}
