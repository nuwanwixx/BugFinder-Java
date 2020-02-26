package Designite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import Designite.SourceModel.*;
import Designite.utils.Constants;
import Designite.utils.Logger;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.cli.*;

/**
 * 
 * This is the start of the project
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
