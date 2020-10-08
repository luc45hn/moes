package com.example.moes;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Repo {
    private List<Rule> rules;

    public Repo(List<Rule> rules) {
        this.rules = rules;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public Optional<Rule> getById(String id) {
        return rules.stream().filter(rule -> rule.getId().equals(id)).findAny();
    }

    public static Repo getMockedRepo(){
        Rule rule1 = new Rule(
                "1",
                "no pueden tomar por tener antecedentes",
                Product.BEER,
                (new Validity(LocalDate.of(2020, 10, 01),
                        LocalDate.of(2020, 12, 01))),
                Set.of(TeamMember.LN, TeamMember.AA));

        Rule rule2 = new Rule(
                "2",
                "prohibido con galletitas",
                Product.TEA,
                (new Validity(LocalDate.of(2020, 10, 01),
                        LocalDate.of(2021, 11, 01))),
                Set.of(TeamMember.AI));

        Rule rule3 = new Rule(
                "3",
                "por apostar",
                Product.FERNET,
                (new Validity(LocalDate.of(2020, 10, 01),
                        LocalDate.of(2021, 02, 01))),
                Set.of(TeamMember.CB, TeamMember.LC));

        return new Repo(List.of(rule1, rule2, rule3));
    }
}
