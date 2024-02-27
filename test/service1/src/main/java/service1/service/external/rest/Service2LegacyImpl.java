package service1.service.external.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class Service2LegacyImpl implements Service2Api {

    private final RestTemplate restTemplate;

    @Override
    public String get() {
        return restTemplate.getForObject("http://service2", String.class);
    }
}
