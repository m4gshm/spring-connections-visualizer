package service1.service.external.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service2FeignClient", url = "service2")
public interface Service2FeignClient {

    @GetMapping("/")
    String get();
}
