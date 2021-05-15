

public class Main {

	public static void main(String[] args) {
	
		Courses course1= new Courses(0, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", 
				"2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını"
				, "Engin Demirog",true);
		
		Courses course2= new Courses(1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", 
				"2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını"
				, "Engin Demirog",true);
		
		Courses course3= new Courses(2, "Programlamaya Giriş için Temel Kurs", 
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır"
				, "Engin Demirog",false);
	
		Courses[] courses= {course1,course2,course3};
	
		for(Courses course:courses) {
			System.out.println(course.title);
			System.out.println(course.details);
			System.out.println(course.teacher); 

			CheckStatus checkStatus=new CheckStatus();
			checkStatus.checkStatus(course);
			
		}
		
		
		
	}

}
