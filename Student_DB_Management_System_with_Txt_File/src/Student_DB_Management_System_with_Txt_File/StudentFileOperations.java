package Student_DB_Management_System_with_Txt_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class StudentFileOperations {
	
	private Formatter StudentFileFormatter;
	private Scanner StudentFileScanner;
	private FileWriter StudentFileWriter;
	
	private String fileName;
	
	
	
	public  StudentFileOperations(String fileName){
		
		this.fileName = fileName;
		
	}
	
	public void openFormatter(boolean append){
		
		try{
			
			StudentFileWriter = new FileWriter(fileName, append);
			StudentFileFormatter = new Formatter(StudentFileWriter);
			StudentFileScanner = new Scanner(new File(fileName));
			
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "File Scanner Openning Fialed");
		}
		
	}
	
	
	public void addMembers(Student member){
		
		openFormatter(true);
		StudentFileFormatter.format("%s %s %s %s %s %s\n", member.getName(),member.getRoll(),member.getBatch(),member.getDepartment(),member.getUniversity(),member.getPhone());
		StudentFileFormatter.close();
			
	}
	

	public ArrayList<Student> getMembers(){
		
		openFormatter(true);
		ArrayList<Student> members = new ArrayList<>();
		
		while(StudentFileScanner.hasNext()){
			
			String name = StudentFileScanner.next();
                        String Roll = StudentFileScanner.next();
                        String Batch = StudentFileScanner.next();
                        String Department = StudentFileScanner.next();
                        String University = StudentFileScanner.next();
                        String Phone = StudentFileScanner.next();
                        
			members.add(new Student(name,Roll,Batch,Department,University,Phone));	
		}		
		return members;
	}

	public void writeMembers(ArrayList<Student> allMembers) {
		
		openFormatter(false);
		
		for (Student member : allMembers) {
			StudentFileFormatter.format("%s %s %s %s %s %s\n", member.getName(),member.getRoll(),member.getBatch(),member.getDepartment(),member.getUniversity(),member.getPhone());
			
		}
		StudentFileFormatter.close();
	}

}

