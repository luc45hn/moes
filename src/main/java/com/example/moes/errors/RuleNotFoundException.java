package com.example.moes.errors;

public class RuleNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public RuleNotFoundException(String id){
        super("Rule id not found : " + id);
    }
}
