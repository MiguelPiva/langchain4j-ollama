package com.estudos.langchain4jollama.langchain4j_ollama.resources.deepseek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.langchain4jollama.langchain4j_ollama.llms.Deepseek;
import com.estudos.langchain4jollama.langchain4j_ollama.services.GetService;

@RestController
@RequestMapping(value="/deepseek")
public class GetResource {

    @Autowired
    private Deepseek model;

    @Autowired
    private GetService service;

    @GetMapping("/normal")
    public ResponseEntity<String> getModelAnswer(@RequestBody String question) {
        String answer = service.normalQuestion(model, question);
        return ResponseEntity.ok().body(answer);
    }
}