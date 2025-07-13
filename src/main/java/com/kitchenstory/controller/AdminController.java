package com.kitchenstory.controller;

import com.kitchenstory.model.FoodItem;
import com.kitchenstory.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @GetMapping("/login")
    public String loginPage() {
        return "admin-login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("items", foodItemRepository.findAll());
        return "admin-dashboard";
    }

    @GetMapping("/add")
    public String addItemForm(Model model) {
        model.addAttribute("item", new FoodItem());
        return "admin-add-item";
    }

    @PostMapping("/add")
    public String addItem(@ModelAttribute FoodItem item) {
        foodItemRepository.save(item);
        return "redirect:/admin/dashboard";
    }

    @GetMapping("/delete/{id}")
    public String deleteItem(@PathVariable Long id) {
        foodItemRepository.deleteById(id);
        return "redirect:/admin/dashboard";
    }
}
