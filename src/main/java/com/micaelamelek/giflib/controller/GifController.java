package com.micaelamelek.giflib.controller;

import com.micaelamelek.giflib.data.GifRepository;
import com.micaelamelek.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * Created by meme on 11/02/16.
 */
@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;
    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        Gif gifObject = gifRepository.findByName(name);
        modelMap.put("gif",gifObject);
        return "gif-details";
    }
}
