package abstraction;

public class Automation extends MultipleLangauge implements TestTool{

	public void Java() {
		System.out.println("Java");
		
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}

}
