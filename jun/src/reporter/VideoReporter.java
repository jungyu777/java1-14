package reporter;

public class VideoReporter implements Reporteble{

	@Override
	public void report() {
		System.out.println("직전 30초 영상과 함꼐 신고를 진행합니다.");
		
	}

}
