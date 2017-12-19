package com.example.recherche.recherche;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by jean-louisliaud on 19/12/2017.
 */
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchRepository searchRepository;

    @Override
    public List<Produits> search() {
        return searchRepository.search();
    }


}

