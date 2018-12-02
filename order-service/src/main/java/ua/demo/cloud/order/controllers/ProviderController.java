package ua.demo.cloud.order.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.demo.cloud.order.dto.ProviderDto;
import ua.demo.cloud.order.services.ProviderService;

import javax.validation.Valid;

@RestController
@RequestMapping("/providers")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @PostMapping
    public ProviderDto postProvider(@RequestBody @Valid ProviderDto providerDto) {
        return this.providerService.save(providerDto);
    }
}
