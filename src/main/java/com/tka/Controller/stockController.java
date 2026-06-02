package com.tka.Controller;

import com.tka.Entity.stock;
import com.tka.Service.stockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/stocks")
public class stockController {

    @Autowired
    private stockService stockService;

    @GetMapping
    public String getAllStocks(Model model) {
        List<stock> list = stockService.getAllStocks();
        model.addAttribute("stocks", list);
        return "viewStock";
    }

    @GetMapping("/stocks")
    public String getStocks(Model model) {
        model.addAttribute("stockList", stockService.getAllStocks());
        return "stock"; // stock.jsp
    }
    
    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("stock", new stock());
        return "addStock";
    }

    @PostMapping("/save")
    public String saveStock(@ModelAttribute stock stock) {
        stockService.saveStock(stock);
        return "redirect:/stocks";
    }

    @GetMapping("/delete/{id}")
    public String deleteStock(@PathVariable int id) {
        stockService.deleteStock(id);
        return "redirect:/stocks";
    }
}