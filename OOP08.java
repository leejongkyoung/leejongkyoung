import java.util.Scanner;

//��ȭ ������ �����ϴ� Ŭ���� �����
// �ʵ� : ����(���ڿ�), ����(���ڿ�), �ֿ�(���ڿ�), �����⵵(����, ����), ����(����, �Ǽ�)
// �޼��� : �ʵ带 ���ڿ��� ���� ��ȯ
// �ʵ�� ��� private > getter, setter �����
// ������ �޼��� �����

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

		//MovieInfor dongju = new MovieInfor("����", "������", "���ϴ�", 2015, 9.18);
		//System.out.println(dongju.Movie());
		
	
		//MovieInfor movie = new MovieInfor();
		
	
		System.out.println("���� : ");
		String title = scanner.nextLine();
		System.out.println("���� : ");
		String director = scanner.nextLine();
		System.out.println("�ֿ� : ");
		String mainactor = scanner.nextLine();


		
		//MovieInfor movie = new MovieInfor(title, director, mainactor, 0, 0);

		//System.out.println(movie.Movie());

		
	}	
	
		
		
		//System.out.println(dongju.director);		
	}
				
		// ��� �ڵ� �ۼ�
		// 1. �ν��Ͻ� �����
		// 2. ������ ����
		// 3. ���

	
}

