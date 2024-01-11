package com.self.SpringAI.service.impl;

import com.self.SpringAI.service.AskAiService;
import org.springframework.ai.client.AiClient;
import org.springframework.ai.client.AiResponse;
import org.springframework.ai.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AskAiServiceImpl implements AskAiService {

    @Autowired
    private AiClient aiClient;

    @Override
    public AiResponse askMe(Prompt question) {
        return aiClient.generate(question);
    }
}
