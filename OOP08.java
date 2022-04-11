import java.util.Scanner;

//영화 정보를 저장하는 클래스 만들기
// 필드 : 제목(문자열), 감독(문자열), 주연(문자열), 개봉년도(숫자, 정수), 평점(숫자, 실수)
// 메서드 : 필드를 문자열로 만들어서 반환
// 필드는 모두 private > getter, setter 만들기
// 생성자 메서드 만들기

class MovieInfor {

	private String title;
	private String director;
	private String mainactor;
	private int openingDate;
	private Double movieRating;


	
	public MovieInfor(String title, String director, String mainactor, int openingDate, Double movieRating) {
		super();
		this.title = title;
		this.director = director;
		this.mainactor = mainactor;
		this.openingDate = openingDate;
		this.movieRating = movieRating;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getMainactor() {
		return mainactor;
	}

	public void setMainactor(String mainactor) {
		this.mainactor = mainactor;
	}

	public int getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(int openingDate) {
		this.openingDate = openingDate;
	}

	public Double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(Double movieRating) {
		this.movieRating = movieRating;
	}
					
		
		public String Movie() {
			return String.format("[%s]\n[%s]\n[%s]\n[%d]\n[%f]",
								title, director, mainactor, openingDate, movieRating);
	}
		

public static class OOP08 {

	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		//MovieInfor dongju = new MovieInfor("동주", "이준익", "강하늘", 2015, 9.18);
		//System.out.println(dongju.Movie());
		
	
		//MovieInfor movie = new MovieInfor();
		
	
		System.out.println("제목 : ");
		String title = scanner.nextLine();
		System.out.println("감독 : ");
		String director = scanner.nextLine();
		System.out.println("주연 : ");
		String mainactor = scanner.nextLine();


		
		//MovieInfor movie = new MovieInfor(title, director, mainactor, 0, 0);

		//System.out.println(movie.Movie());

		
	}	
	
		
		
		//System.out.println(dongju.director);		
	}
				
		// 사용 코드 작성
		// 1. 인스턴스 만들기
		// 2. 데이터 저장
		// 3. 출력

	
}

