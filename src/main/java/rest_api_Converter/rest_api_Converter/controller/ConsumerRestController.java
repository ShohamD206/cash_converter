package rest_api_Converter.rest_api_Converter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest_api_Converter.rest_api_Converter.model.Converter;
import rest_api_Converter.rest_api_Converter.service.ConsumerRestService;

@RestController
@RequestMapping("/api/currency")
public class ConsumerRestController {
    @Autowired
    private ConsumerRestService service;

    @PostMapping("/convert")
    public String convertCash(@RequestBody Converter converter) {
        return service.displayIlsCurrency(converter);
    }


}
