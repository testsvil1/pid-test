package test;

import rlazio.pid.PidExecutor2;

public class PidExecutorLauncher {

	public static void main(String[] args) {
		String[] par = new String[] {"-xmldir", "C:/work/20220822_PID_Paramucchi/pid",  "-prv", "RM_C1",  "-outfile", "c:/temp/tempParam.xlsx", "-y"};
		PidExecutor2.main(par);
	}
	
}
