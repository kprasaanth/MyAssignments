package abstraction;

public abstract class MultipleLangauge implements TestTool, Language {

	public void python() {
		System.out.println("Python Language");
	}

	public abstract void ruby();


}
