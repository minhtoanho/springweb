package com.mt.spring.api;

import com.mt.spring.domain.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/countries")
public class CountryApi {

    @RequestMapping(method = RequestMethod.GET)
    public List<Country> getList() {
        return getSampleList();
    }

    private List<Country> getSampleList() {
        List<Country> countries = new ArrayList<Country>();

        countries.add(new Country("84", "Vietnam"));
        countries.add(new Country("65", "Singapore"));
        return countries;
    }
}
