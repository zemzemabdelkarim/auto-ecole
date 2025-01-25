package com.autoecole.amjalal.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autoecole.amjalal.models.HourModel;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class HourController {
    public static ArrayList<HourModel> hours = new ArrayList<>();
    public static int hoursCount = 0;

    //debugging
    public HourController() {
        super();
        hours.add(new HourModel(++hoursCount, 2, 1, new Date()));
        hours.add(new HourModel(++hoursCount, 2, 2, new Date()));
        hours.add(new HourModel(++hoursCount, 1, 1, new Date()));
    }

    @RequestMapping("/getHours")
    public ArrayList<HourModel> getHours() {
        return hours;
    }

}

