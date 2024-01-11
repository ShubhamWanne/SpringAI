package com.self.SpringAI.web;

import com.self.SpringAI.service.AskAiService;
import com.self.SpringAI.service.PromptService;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.ai.client.AiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@RestController
@Slf4j
public class AIClientController {

    @Autowired
    private AskAiService aiAskService;

    @Autowired
    private PromptService promptService;

    @GetMapping("/ask-me")
    public ResponseEntity<AiResponse> answerMe(@RequestParam("query") String query){
        Instant start = Instant.now();
        var prompt = promptService.generatePrompt(query);
        var response = aiAskService.askMe(prompt);
        log.info("Total execution time : {}", ChronoUnit.SECONDS.between(start, Instant.now()));
        return ResponseEntity.ok(response);
    }

}
