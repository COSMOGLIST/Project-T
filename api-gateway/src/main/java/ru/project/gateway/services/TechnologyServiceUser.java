package ru.project.gateway.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.TechnologyClient;
import ru.project.models.TechnologyDto;
import ru.project.security.modelscha.VoteInfo;
import ru.project.security.repositories.VotingRepository;
import ru.project.security.services.UserService;

import java.util.List;

@Service
public class TechnologyServiceUser {
    private TechnologyClient technologyClient;
    private UserService userService;

    @Autowired
    public TechnologyServiceUser(TechnologyClient technologyClient, UserService userService) {
        this.technologyClient = technologyClient;
        this.userService = userService;
    }

    public TechnologyDto findById(int id) {
        return technologyClient.findById(id);
    }

    public List<TechnologyDto> getByCriteria(String id, String name, String technologyType, String ring) {
        return technologyClient.getByCriteria(id, name, technologyType, ring);
    }

    public void vote(int id, String rang) {
        int userId = userService.getCurrentUser().getId();
    }
}