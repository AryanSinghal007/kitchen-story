package com.kitchenstory.controller;

import com.kitchenstory.model.FoodItem;
import com.kitchenstory.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @GetMapping("/")
    public String home(Model model) {
        List<FoodItem> items = foodItemRepository.findAll();
        model.addAttribute("foodItems", items);
        return "home";
    }

    @PostMapping("/search")
    public String search(@RequestParam("keyword") String keyword, Model model) {
        List<FoodItem> results = foodItemRepository.findByNameContainingIgnoreCase(keyword);
        model.addAttribute("items", results);
        return "results";  // shows results.html
    }

    @GetMapping("/order/{id}")
    public String orderPage(@PathVariable Long id, Model model) {
        FoodItem item = foodItemRepository.findById(id).orElse(null);
        model.addAttribute("item", item);
        return "order";
    }

    @PostMapping("/confirm")
    public String confirmOrder(@RequestParam("itemId") Long id, Model model) {
        FoodItem item = foodItemRepository.findById(id).orElse(null);
        model.addAttribute("item", item);
        return "confirmation";
    }
}
