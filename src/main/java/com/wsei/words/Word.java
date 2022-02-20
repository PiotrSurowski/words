package com.wsei.words;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String word;

    public Word(String word) {
        this.word = word;
    }

    public Word() {
    }

    public Integer getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
