package com.example.recherche.recherche;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jean-louisliaud on 19/12/2017.
 */

@Repository
public class SearchRepositoryImpl implements SearchRepository{
    private List<Produits> list = new ArrayList();

    public List<Produits> search(){
        return list;
    };



}
