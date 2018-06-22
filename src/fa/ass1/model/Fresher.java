package fa.ass1.model;

public class Fresher {
    private String code;
    private String fullName;
    private String id;
    private String university;
    private String trainnerComment;
    private Department department;

    public static int numFresher;

    public Fresher(String code, String fullName, String id, String university, String trainnerComment,
            Department department) {
        super();
        this.code = code;
        this.fullName = fullName;
        this.id = id;
        this.university = university;
        this.trainnerComment = trainnerComment;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getTrainnerComment() {
        return trainnerComment;
    }

    public void setTrainnerComment(String trainnerComment) {
        this.trainnerComment = trainnerComment;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
}
