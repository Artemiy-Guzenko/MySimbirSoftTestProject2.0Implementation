package ru.guzenko.sbstestproject.service;

import ru.guzenko.sbstestproject.model.Url;

import java.util.List;
import java.util.Map;

public interface UrlService {

    public Map<String, Integer> addWords(Url url);

    public List<Url> listAllUrls();
}
