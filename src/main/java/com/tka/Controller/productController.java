package com.tka.Controller;

import com.tka.Entity.Product;
import com.tka.Service.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class productController {

    @Autowired
    private productService productService;

    // ✅ Get all products
    @GetMapping
    public String getAllProducts(Model model) {
        List<Product> list = productService.getAllProducts();
        model.addAttribute("products", list);
        return "viewProduct";   // ❗ remove .jsp
    }

    // ✅ Show add form
    @GetMapping("/add")   // ✅ FIXED
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";   // ❗ remove .jsp
    }

   
    @GetMapping("/products")
    public String viewProducts() {
        return "viewProduct";
    }


    // ✅ Save product
    @PostMapping("/save")
    public String saveProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    // ✅ Delete product
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}