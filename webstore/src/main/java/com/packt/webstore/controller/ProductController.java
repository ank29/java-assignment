package com.packt.webstore.controller;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;
import com.packt.webstore.service.impl.ProductServiceImpl;
@Controller
public class ProductController {
@Autowired
private ProductServiceImpl productService;
@RequestMapping("/products")
public String list(Model model) {
model.addAttribute("products", productService.getAllProducts());
return "products";
}

}

