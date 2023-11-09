package org.narainox.Mappings;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {
    @Id
    int question_id;
    String question;

    /*
    @OneToOne
    @JoinColumn(name="answer_id")

     */

    @OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
    private List<Answer> answers;






    public Question(int question_id, String question, List<Answer> answers) {
        this.question_id = question_id;
        this.question = question;
        this.answers = answers;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Question() {
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question_id=" + question_id +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    /*
    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }



    public Question(int question_id, String question, Answer answer) {
        this.question_id = question_id;
        this.question = question;
        this.answer = answer;
    }

     */
}
