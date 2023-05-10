package test.mypac;

import detector.Detectable;
import reporter.Reporteble;

public class FactoryCam extends Camera implements Detectable,Reporteble{
	private Detectable detector; //인터페이스 변수
	private Reporteble reporter; //인터페이스 변수
	
	public void setDetector(Detectable detector) {
		this.detector = detector;
	}
	public void setReporter(Reporteble reporter) {
		this.reporter = reporter;
	}
	
	
	
	@Override
	public void showMainFeature() {
		System.out.println("화재감지");
		
	}

	@Override
	public void report() {
		reporter.report();
		
	}

	@Override
	public void detect() {
		detector.detect();
		 
	}
	
	

}
