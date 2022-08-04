package com.victolee.signuplogin.service;

import com.victolee.signuplogin.domain.entity.City;
import com.victolee.signuplogin.domain.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Page<City> findCityList(Pageable pageable, String id) {
        Sort sort = Sort.by(id).descending();
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1, 10, sort);
        return cityRepository.findAll(pageable);
    }
}
