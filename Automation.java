package week3.day1.assignments;

public class Automation extends MultipleLangauge{
	
	public void Selenium() {
		System.out.println("Selenium : TestTool");
	}

	public void Java() {
		System.out.println("Java :Language");		
	}

	public void ruby() {
		System.out.println("ruby :Abstract info ");
	}

	public static void main(String[] args) {
		
		Automation details = new Automation();
		details.Java();
		details.python();
		details.ruby();
		details.Selenium();

}}
