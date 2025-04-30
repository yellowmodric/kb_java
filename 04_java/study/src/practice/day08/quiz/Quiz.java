package practice.day08.quiz;

public class Quiz {
    private String question;
    private String answer;

    public Quiz(String answer, String question) {
        this.answer = answer;
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
