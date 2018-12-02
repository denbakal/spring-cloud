package ua.demo.cloud.order.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.demo.cloud.order.dto.ProductDto;
import ua.demo.cloud.order.services.ProductService;

import javax.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductDto postService(@RequestBody @Valid ProductDto productDto) {
        return this.productService.save(productDto);
    }
}
