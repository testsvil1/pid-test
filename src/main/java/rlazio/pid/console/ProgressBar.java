package rlazio.pid.console;

public class ProgressBar {

	int total;
	int step = 100;
	int internal;
	
	int maxBareSize = 10; 
    char defaultChar = '-';
    String icon = "*";
    
	
	public ProgressBar(int total) {
		this.total = total;
	}
	
	public void progress(int progress) {
		progress++;
		if ((progress % step == 0) || (progress==total)) {
			int complete = 100 * progress / total;  			
			writeBar(complete, progress);
		}
	}
	
	public void progress() {
		internal++;
		int progress = internal;
		if ((progress % step == 0) || (progress==total)) {
			int complete = 100 * progress / total;  			
			writeBar(complete, progress);
		}
	}
	
	private void writeBar(int complete, int progress) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int completeChar = complete * maxBareSize / 100;
		for(int i=0; i<completeChar; i++) {
			sb.append("*");
		}
		for(int i=completeChar; i<maxBareSize; i++) {
			sb.append(".");
		}

		sb.append("]");
		System.out.print("\r" + sb + " " + complete + "% (" + progress + ")");
	}

	
	
	
	public static void main(String[] args) {
		int tot = 5000;
		ProgressBar pb = new ProgressBar(tot);
		for (int i=0; i<tot; i++) {
			//System.out.println(i);
			pb.progress();
			//System.out.println(i);
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	
	
	/*
	
	
	if (remain > total) {
	        throw new IllegalArgumentException();
	    }
	    int maxBareSize = 10; // 10unit for 100%
	    int remainProcent = ((100 * remain) / total) / maxBareSize;
	    char defaultChar = '-';
	    String icon = "*";
	    String bare = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
	    StringBuilder bareDone = new StringBuilder();
	    bareDone.append("[");
	    for (int i = 0; i < remainProcent; i++) {
	        bareDone.append(icon);
	    }
	    String bareRemain = bare.substring(remainProcent, bare.length());
	    System.out.print("\r" + bareDone + bareRemain + " " + remainProcent * 10 + "%");
	    if (remain == total) {
	        System.out.print("\n");
	  
	    
	    
	    
	    */
}
