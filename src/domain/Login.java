
package domain;

import java.io.Serializable;

public class Login implements Serializable {
    private String userid;
    private String password;
    private String question;
    private String answer;

    public Login() {
    }
    
    public Login(String userid) {
        this.userid = userid;
    }

    public Login(String userid, String password, String question, String answer) {
        this.userid = userid;
        this.password = password;
        this.question = question;
        this.answer = answer;
    }
    
    public String getUserid() {
        return userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    @Override
    public String toString() {
        return String.format("%-5s %-10s %-30s %-30s", userid, password, question, answer);
    }
    
}

