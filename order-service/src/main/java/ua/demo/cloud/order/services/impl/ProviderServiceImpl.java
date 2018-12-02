package ua.demo.cloud.order.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.demo.cloud.order.dto.ProviderDto;
import ua.demo.cloud.order.entity.Provider;
import ua.demo.cloud.order.mapper.ProviderMapper;
import ua.demo.cloud.order.repositories.ProviderRepository;
import ua.demo.cloud.order.services.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderMapper providerMapper;

    @Autowired
    private ProviderRepository providerRepository;

    @Override
    public ProviderDto save(ProviderDto providerDto) {
        Provider newProvider = this.providerRepository.save(this.providerMapper.toProvider(providerDto));
        return this.providerMapper.fromProvider(newProvider);
    }
}
