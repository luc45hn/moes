package com.example.moes;

import com.example.moes.errors.RuleNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RuleService {

    @GetMapping("/blocking-rule")
    public Rule blockingRule(@RequestParam(value = "id", defaultValue = "0") String id) {
        Repo repo = Repo.getMockedRepo();
        Optional<Rule> rule = repo.getById(id);
        return rule.orElseThrow(() -> new RuleNotFoundException(id));
    }

    @GetMapping("/blocking-rules")
    public List<Rule> blockingRules() {
        Repo repo = Repo.getMockedRepo();
        return repo.getRules();
    }

}
