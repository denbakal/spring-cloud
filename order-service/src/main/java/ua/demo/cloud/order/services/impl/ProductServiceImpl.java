package ua.demo.cloud.order.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.demo.cloud.order.dto.ProductDto;
import ua.demo.cloud.order.entity.Product;
import ua.demo.cloud.order.mapper.ProductMapper;
import ua.demo.cloud.order.repositories.ProductRepository;
import ua.demo.cloud.order.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductDto save(ProductDto productDto) {
        Product newProduct = this.productRepository.save(this.productMapper.toProduct(productDto));
        return this.productMapper.fromProduct(newProduct);
    }
}
