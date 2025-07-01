package com.estudos.langchain4jollama.langchain4j_ollama.llms;

import org.springframework.stereotype.Component;

@Component
public class Deepseek extends LLM {
    public Deepseek() {
        super(
            "deepseek-r1", 
            "http://localhost:11435"
            );
    }
}
