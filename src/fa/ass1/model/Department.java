package fa.ass1.model;

public class Department {
    private String fullName;
    private String sortName;
    private String code;
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getSortName() {
        return sortName;
    }
    public void setSortName(String sortName) {
        this.sortName = sortName;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Department(String fullName, String sortName, String code) {
        super();
        this.fullName = fullName;
        this.sortName = sortName;
        this.code = code;
    }
}
