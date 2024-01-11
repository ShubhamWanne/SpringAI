package com.self.SpringAI.service.impl;

import com.self.SpringAI.service.PromptService;
import org.springframework.ai.prompt.Prompt;
import org.springframework.ai.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

@Service
public class PromptServiceImpl implements PromptService {
    @Override
    public Prompt generatePrompt(String question) {
        return new PromptTemplate(question).create();
    }
}
