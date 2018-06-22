package fa.ass1.model;

public class Quiz {
    private String fullName;
    private String content;
    private String code;
    public static int numQuiz=0;
    public Quiz(String fullName, String content, String code) {
        super();
        this.fullName = fullName;
        this.content = content;
        this.code = code;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    
}
