package com.example.moes;

public enum TeamMember {
    LN("Leandro"),
    CB("Cristian"),
    LC("Lautaro"),
    AA("Adriana"),
    AI("Amalia");

    public final String label;

    TeamMember(String name) {
        this.label = name;
    }
}
