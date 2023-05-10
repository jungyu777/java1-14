package juntest.main;

import detector.AccidentDetector;
import reporter.VideoReporter;
import test.mypac.SpeedCam;

public class Quiz1 {

	public static void main(String[] args) {
		SpeedCam speedCam = new SpeedCam();
		speedCam.setdetector(new AccidentDetector());
		speedCam.setreporter(new VideoReporter());
		speedCam.detect();
		speedCam.report();

	}

}
