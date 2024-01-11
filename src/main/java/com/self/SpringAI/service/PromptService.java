package com.self.SpringAI.service;

import org.springframework.ai.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public interface PromptService {
    Prompt generatePrompt(String question);
}
