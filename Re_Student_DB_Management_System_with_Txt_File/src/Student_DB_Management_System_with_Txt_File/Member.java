
public class Member {

    private String name, Roll, Batch, Department, University, Phone;

    public Member(String name, String Roll, String Batch, String Department, String University, String Phone) {
        super();
        this.name = name;
        this.Roll = Roll;
        this.Batch = Batch;
        this.Department = Department;
        this.University = University;
        this.Phone = Phone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String Batch) {
        this.Batch = Batch;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

}
