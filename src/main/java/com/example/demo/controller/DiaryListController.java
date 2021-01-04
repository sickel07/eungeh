package com.example.demo.controller;

import java.util.List;

import com.example.demo.Diary;
import com.example.demo.DiaryListRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/")
public class DiaryListController {

    private static final String user="";

    private DiaryListRepository diaryListRepository;

    //@Autowired
    public DiaryListController(DiaryListRepository diaryListRepository) {
        this.diaryListRepository = diaryListRepository;
    }

    //@RequestMapping(method= RequestMethod.GET)
    @RequestMapping("/")
    public String usersDiarys(Model model) {
        List<Diary> diaryList = diaryListRepository.findByUser(user);
        if (diaryList != null) {
            model.addAttribute("diarys", diaryList);
        }
        return "diaryList";
    }

    @RequestMapping("/save")
    //@RequestMapping(method = RequestMethod.POST)
    public String addToReadingList(Diary diary) {
        diary.setUser(user);
        diaryListRepository.save(diary);
        return "redirect:/";
    }

    @RequestMapping("/delete/{no}")
    //@RequestMapping(method = RequestMethod.POST)
    public String deleteList(@PathVariable("no") Long no) {
        diaryListRepository.delete(diaryListRepository.getOne(no));
        return "redirect:/";
    }

    @RequestMapping("/post")
    //@RequestMapping(method = RequestMethod.POST)
    public String move() {
        return "main/write";
    }
}
