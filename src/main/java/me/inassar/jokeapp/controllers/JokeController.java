package me.inassar.jokeapp.controllers;

import me.inassar.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ahmed Nassar.
 * Date: 16 May, 2020
 * Time: 5:55 PM
 */
@Controller
public class JokeController {

    private JokeService service;

    @Autowired
    public JokeController(JokeService service) {
        this.service = service;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke",service.getRandomJoke());
        return "chucknorries";
    }
}