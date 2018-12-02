package ua.demo.cloud.order.mapper;

import org.mapstruct.Mapper;
import ua.demo.cloud.order.dto.ProviderDto;
import ua.demo.cloud.order.entity.Provider;

@Mapper(componentModel = "spring")
public interface ProviderMapper {
    ProviderDto fromProvider(Provider provider);
    Provider toProvider(ProviderDto providerDto);
}
