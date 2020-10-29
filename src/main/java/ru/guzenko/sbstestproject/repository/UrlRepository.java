package ru.guzenko.sbstestproject.repository;


import ru.guzenko.sbstestproject.model.Url;

import java.util.List;

public interface UrlRepository {

    public void addWords(Url url);

    public List<Url> listAllUrls();
}
