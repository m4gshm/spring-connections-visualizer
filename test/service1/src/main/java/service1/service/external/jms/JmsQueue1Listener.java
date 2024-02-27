package service1.service.external.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.annotation.JmsListeners;
import org.springframework.stereotype.Service;

@Service
public class JmsQueue1Listener {

    @JmsListener(destination = "queue1")
    public void listenQueue1(String message) {

    }

    @JmsListeners(@JmsListener(destination = "queue2"))
    public void listenQueue2(String message) {

    }
}
