package ua.demo.cloud.report.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.demo.cloud.report.dto.ReportDto;

@RestController
@RequestMapping("/reports")
@Log4j2
public class ReportController {
    @PostMapping
    public void post(@RequestBody ReportDto reportDto) {
        log.debug("Handling report by order: {}", reportDto);
    }
}
