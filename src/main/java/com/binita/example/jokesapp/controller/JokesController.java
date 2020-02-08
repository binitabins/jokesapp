package com.binita.example.jokesapp.controller;

import com.binita.example.jokesapp.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokeService;

    @Autowired
    public JokesController(JokesService jokeService) {
        this.jokeService = jokeService;
    }


        @RequestMapping({"/", ""})
        public String showJoke(Model model){

            model.addAttribute("joke", jokeService.getJokes());

            return "chucknorris";
        }


}
