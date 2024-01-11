package com.self.SpringAI.service;

import org.springframework.ai.client.AiResponse;
import org.springframework.ai.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public interface AskAiService {
    public AiResponse askMe(Prompt question);
}
