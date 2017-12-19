package com.example.recherche.recherche;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jean-louisliaud on 19/12/2017.
 */

@RestController
public class controllerSearch {
    private SearchService searchservice;

    @RequestMapping(value="/recherche", method= RequestMethod.GET)
    public @ResponseBody
    List<Produits> search() { return searchservice.search(); }





}
