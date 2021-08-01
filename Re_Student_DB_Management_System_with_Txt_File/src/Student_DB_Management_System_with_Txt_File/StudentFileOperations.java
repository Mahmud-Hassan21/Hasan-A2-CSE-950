import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class StudentFileOperations {
	
	private Formatter memberFileFormatter;
	private Scanner memberFileScanner;
	private FileWriter memberFileWriter;
	
	private String fileName;
	
	
	
	public  StudentFileOperations(String fileName){
		
		this.fileName = fileName;
		
	}
	
	public void openFormatter(boolean append){
		
		try{
			
			memberFileWriter = new FileWriter(fileName, append);
			memberFileFormatter = new Formatter(memberFileWriter);
			memberFileScanner = new Scanner(new File(fileName));
			
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "File Scanner Openning Fialed");
		}
		
	}
	
	
	public void addMembers(Member member){
		
		openFormatter(true);
		memberFileFormatter.format("%s %s %s %s %s %s\n", member.getName(),member.getRoll(),member.getBatch(),member.getDepartment(),member.getUniversity(),member.getPhone());
		memberFileFormatter.close();
			
	}
	

	public ArrayList<Member> getMembers(){
		
		openFormatter(true);
		ArrayList<Member> members = new ArrayList<>();
		
		while(memberFileScanner.hasNext()){
			
			String name = memberFileScanner.next();
                        String Roll = memberFileScanner.next();
                        String Batch = memberFileScanner.next();
                        String Department = memberFileScanner.next();
                        String University = memberFileScanner.next();
                        String Phone = memberFileScanner.next();
                        
			members.add(new Member(name,Roll,Batch,Department,University,Phone));	
		}		
		return members;
	}

	public void writeMembers(ArrayList<Member> allMembers) {
		
		openFormatter(false);
		
		for (Member member : allMembers) {
			memberFileFormatter.format("%s %s %s %s %s %s\n", member.getName(),member.getRoll(),member.getBatch(),member.getDepartment(),member.getUniversity(),member.getPhone());
			
		}
		memberFileFormatter.close();
	}

}

