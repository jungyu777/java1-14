package test.mypac;

import detector.Detectable;
import reporter.Reporteble;

public class SpeedCam extends Camera implements Detectable,Reporteble{
	private Detectable detector;
	private Reporteble reporter;
	
	public void setdetector(Detectable detector) {
		this.detector = detector; 
	}
	public void setreporter(Reporteble reporter) {
		this.reporter = reporter;
	}

	@Override
	public void showMainFeature() {
		System.out.println("속도측정, 번호인식");
	}

	@Override
	public void report() {
		detector.detect();
		
	}

	@Override
	public void detect() {
		reporter.report();
		
	}
	
	
}
