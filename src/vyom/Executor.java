package vyom;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jalatif
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Executor {

	
	public List<String> runCode(String filename, String language, String cmd_input, int runtype){
			if (runtype == 0){
			String code = filename;
			if (language.equalsIgnoreCase("C")){
				filename = "checkRun.c";
			}
			if (language.equalsIgnoreCase("C++")){
				filename = "checkRun.cpp";
			}
			if (language.equalsIgnoreCase("Java")){
				filename = "checkRun.java";
			}
			if (language.equalsIgnoreCase("Python")){
				filename = "checkRun.py";
			}
			try{
			PrintWriter p=new PrintWriter(filename);
			p.print(code);
			p.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		List<String> lines = new ArrayList();
		if (language.equalsIgnoreCase("C") || language.equalsIgnoreCase("C++")){
			execute("gcc -o /home/jalatif/workspace/jalExecs/myCheck.out " + filename);
			lines = execute("/home/jalatif/workspace/jalExecs/myCheck.out" + " " + cmd_input);
		}
		if (language.equalsIgnoreCase("Java")){
			execute("javac " + filename);
			String dir = filename.substring(0, filename.lastIndexOf('/'));
			String filer = filename.substring(filename.lastIndexOf('/') + 1, filename.lastIndexOf('.'));
			System.out.println(dir + " "+ filer);
			execute("cp " + filer + " " + dir + "/" +"filer"+".class");
			lines = execute ("java " + filer + " " + cmd_input);
		}
		if (language.equalsIgnoreCase("Python")){
			lines = execute("python " + filename + " " + cmd_input);
		}
		return lines;
	}
	public List execute(String cmd)
	{
		List<String> lines = new ArrayList();
		//String cmd = "cat /home/jalatif/.bashrc" ;
		Runtime run = Runtime.getRuntime() ;
		try{
			Process pr = run.exec(cmd) ;
			pr.waitFor() ;
			BufferedReader buf = new BufferedReader( new InputStreamReader( pr.getInputStream() ) ) ;
			String line;
			while ((line = buf.readLine())!=null)
			{
				//System.out.println(line);
				lines.add(line);
			}
		}
		catch(Exception e){
			System.out.println("Invalid Command or its Parameters");
		}
		return lines;

	}
	
	public void listPrinter(List<String> lines){
		for (int i = 0; i<lines.size();i++)
			System.out.println(lines.get(i));	
	}
	
	public static void main(String arg[]){
		Executor ex = new Executor();
		List<String> lines = ex.execute("cat /home/jalatif/.bashrc");
		ex.listPrinter(lines);
		lines = ex.runCode("/media/Data/programs/practice/c_practice/size_struct.c", "C", "", 1);
		ex.listPrinter(lines);
		lines = ex.runCode("/home/jalatif/programs/NetBeans_Projects_Dir/NetBeansProjects/Vyom/checkRun.py", "Python", "", 1);
		ex.listPrinter(lines);
		lines = ex.runCode("/home/jalatif/programs/NetBeans_Projects_Dir/NetBeansProjects/Vyom/checkRun.java", "Java", "", 1);
		ex.listPrinter(lines);
	}
}
