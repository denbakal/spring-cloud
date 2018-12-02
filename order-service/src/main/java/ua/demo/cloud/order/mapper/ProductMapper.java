package ua.demo.cloud.order.mapper;

import org.mapstruct.Mapper;
import ua.demo.cloud.order.dto.ProductDto;
import ua.demo.cloud.order.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDto fromProduct(Product product);
    Product toProduct(ProductDto productDto);
}
