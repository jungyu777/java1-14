package juntest.main;

import detector.AdvancedFireDetector;
import detector.Detectable;
import detector.FireDetector;
import reporter.NormalReporter;
import reporter.Reporteble;
import reporter.VideoReporter;
import test.mypac.FactoryCam;

public class Main02 {

	public static void main(String[] args) {
		//인터페이스 그냥 뼈대만 제공하는 구조
		//코드의 중복을 줄이고
		
		 
		//인터페이스를 구현 함으로써 이 인터페이스를 구현하는 모든 클래스들은 이인터페이스 자체를 통해서 참조를 할수있고
		//Reportable인터페이스 내에 있는 똑같은 report() 메소드들은  항상 구현이 되어있다
		NormalReporter normalReporter = new NormalReporter();
		normalReporter.report();
		
		VideoReporter videoReporter = new VideoReporter();
		videoReporter.report();
		
		System.out.println("-------------------");
		
		Detectable fireDetector = new FireDetector();
		fireDetector.detect();
		
		Detectable abvancedFireDetector = new AdvancedFireDetector();
		abvancedFireDetector.detect();
		
		
		System.out.println("-------------------------");
		FactoryCam factoryCam = new FactoryCam(); 
		factoryCam.setDetector(abvancedFireDetector);
		factoryCam.setReporter(videoReporter);
		
		factoryCam.detect();
		factoryCam.report();
		
		
		
	}

}
