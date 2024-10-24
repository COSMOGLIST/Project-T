package ru.project.gateway.services;

import org.springframework.stereotype.Service;
import ru.project.TechnologyClient;
import ru.project.models.TechnologyDto;

import java.util.List;

@Service
public class TechnologyServiceUser {
    private TechnologyClient technologyClient;

    public TechnologyServiceUser(TechnologyClient technologyClient) {
        this.technologyClient = technologyClient;
    }

    public TechnologyDto findById(int id) {
        return technologyClient.findById(id);
    }

    public List<TechnologyDto> getByCriteria(String id, String name, String technologyType, String ring) {
        return technologyClient.getByCriteria(id, name, technologyType, ring);
    }

    public void vote(int id, String rang) {
        technologyClient.vote(id, rang);
    }
}
