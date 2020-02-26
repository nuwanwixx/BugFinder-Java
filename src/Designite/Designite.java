package Designite;

import java.io.IOException;
import Designite.SourceModel.*;



/**
 * 
 * This is the start of the bug finder
 */
public class Designite {
	public static void main(String[] args) throws IOException {
		String inputPath = "D:\\Academic\\IT mora\\Course Modules\\4th Year\\Research Project\\Dependency Extractor\\Theekshana\\code_city-master\\code_city";

		InputArgs argsObj =  new InputArgs(inputPath);
		SM_Project project = new SM_Project(argsObj); //get source name and path for save result - argsObj


		project.parse();
		project.resolve();
		project.computeMetrics();
		project.detectCodeSmells();
		
		System.out.println(new SM_Type().getBuglist()); 
	}
}
