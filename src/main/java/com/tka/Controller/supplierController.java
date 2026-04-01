package com.tka.Controller;

import com.tka.Entity.supplier;
import com.tka.Service.supplierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/suppliers")
public class supplierController {

    @Autowired
    private supplierService supplierService;

    @GetMapping
    public String getAllSuppliers(Model model) {
        List<supplier> list = supplierService.getAllSuppliers();
        model.addAttribute("suppliers", list);
        return "viewSupplier";
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("supplier", new supplier());
        return "addSupplier";
    }

    @PostMapping("/save")
    public String saveSupplier(@ModelAttribute supplier supplier) {
        supplierService.saveSupplier(supplier);
        return "redirect:/suppliers";
    }

    @GetMapping("/delete/{id}")
    public String deleteSupplier(@PathVariable int id) {
        supplierService.deleteSupplier(id);
        return "redirect:/suppliers";
    }
}