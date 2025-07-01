package com.estudos.langchain4jollama.langchain4j_ollama.services;

import org.springframework.stereotype.Service;

import com.estudos.langchain4jollama.langchain4j_ollama.llms.LLM;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;


@Service
public class GetService {
    public String normalQuestion(LLM llm, String question) {
        ChatModel model = OllamaChatModel.builder()
            .baseUrl(llm.getBaseUrl())
            .modelName(llm.getModelName())
            .build();
        String answer = model.chat(question);
        return (answer + "\n");
    }
}
