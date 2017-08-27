package org.ihsusta.template.service;

import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    void transfer(String out, String in, Double money);
}
