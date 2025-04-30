package practice.day08.quiz;

public class QuizBox <T extends Quiz>{
    private T[] list;
    private int size;

    public QuizBox(int size) {
        this.size = 5;
        list = (T[]) new Quiz[size];
    }

    public void addQuiz(T quiz) {

    }
}
