package nl.quin.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private static String[] questions = {
            "What is your name?",
            "What is your quest?",
            "What is your favourite colour?",
            "What is the capital of Assyria?",
            "What is the airspeed velocity of an unladen swallow?",
            "African or European?"
    };

    private static String[] answers = {
            "Sir Lancelot",
            "I seek the grail",
            "Blue",
            "Aššur",
            "Wich kind of swallow?",
            "I don't know that. AAAAaaRGH"

    };

    @GetMapping(value = "/questions")       // collection
    public String[] getQuestions() {
        return questions;
    }

    @GetMapping(value = "/questions/{nr}")       // item
    public String getQuestion(@PathVariable int nr) {
        return questions[nr];
    }

    @GetMapping(value = "/questions/{nr}/answer")       // document
    public String getAnswer(@PathVariable int nr) {
        return answers[nr];
    }

    @PostMapping(value = "/questions")
    public void addQuestion() {
        // voeg vraag toe!!
    }


}