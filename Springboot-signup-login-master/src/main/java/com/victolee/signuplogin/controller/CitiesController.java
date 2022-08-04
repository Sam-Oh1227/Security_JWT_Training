package com.victolee.signuplogin.controller;

import com.victolee.signuplogin.domain.entity.City;
import com.victolee.signuplogin.service.CityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/cities")
@Controller
public class CitiesController {

    private final CityService cityService;

    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/list")
    public String CitiesMapping(Pageable pageable, Model model){
        Page<City> p;
        p = cityService.findCityList(pageable, "id");

        int totalPage = p.getTotalPages();
        int nowPage = p.getPageable().getPageNumber() + 1;
        int startPage = Math.max(nowPage - 4, 1);
        int endPage = Math.min(nowPage + 4, p.getTotalPages());

        model.addAttribute("cityList", p);
        model.addAttribute("totalPage", totalPage);
        model.addAttribute("nowPage", nowPage);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        return "/view/cities";
    }
}
