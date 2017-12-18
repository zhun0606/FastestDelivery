
package domain;

import java.io.Serializable;

public class User implements Serializable {
    private String userId;
    private String password;
    private String question;
    private String answer;

    public User() {
    }
    
    public User(String userId) {
        this.userId = userId;
    }

    public User(String userId, String password, String question, String answer) {
        this.userId = userId;
        this.password = password;
        this.question = question;
        this.answer = answer;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
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
        return String.format("%-5s %-10s %-30s %-30s", userId, password, question, answer);
    }
    
}

