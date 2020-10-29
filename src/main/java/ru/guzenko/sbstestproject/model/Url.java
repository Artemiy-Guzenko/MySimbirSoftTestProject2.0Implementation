package ru.guzenko.sbstestproject.model;

import javax.persistence.*;

@Entity
@Table(name = "TEST")
public class Url {                  //класс-сущность

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PATH")
    private String path;

    @Column(name = "WORD")
    private String word;

    @Column(name = "COUNT")
    private Long count;

    public Url(Long id, String path, String word, Long count) {
        this.id = id;
        this.path = path;
        this.word = word;
        this.count = count;
    }

    public Url(String path, String word, Long count) {
        this.path = path;
        this.word = word;
        this.count = count;
    }

    public Url() {

    }

    public Url(String path) {
        this.path = path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Url{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
