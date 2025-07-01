package com.estudos.langchain4jollama.langchain4j_ollama.llms;


public abstract class LLM {
    protected String MODEL_NAME; 
    protected String BASE_URL;

    public LLM(String modelName, String baseURL) {
        MODEL_NAME = modelName;
        BASE_URL = baseURL;
    }

    public String getModelName() {
        return MODEL_NAME;
    }

    public String getBaseUrl() {
        return BASE_URL;
    }
}
