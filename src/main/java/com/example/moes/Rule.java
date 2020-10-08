package com.example.moes;

import java.util.List;
import java.util.Set;

public class Rule {

    private String id;
    private String name;
    private Product product;
    private Validity validity;
    private Set<TeamMember> teamMembers;

    public Rule(String id, String name, Product product, Validity validity, Set<TeamMember> teamMembers) {
        this.id = id;
        this.name = name;
        this.product = product;
        this.validity = validity;
        this.teamMembers = teamMembers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Validity getValidity() {
        return validity;
    }

    public void setValidity(Validity validity) {
        this.validity = validity;
    }

    public Set<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(Set<TeamMember> teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", validity=" + validity +
                ", teamMembers=" + teamMembers +
                '}';
    }
}
