package ru.project.gateway.services;

import org.springframework.stereotype.Service;
import ru.project.TechnologyClient;
import ru.project.models.TechnologyDto;

@Service
public class TechnologyServiceAdmin {
    private TechnologyClient technologyClient;

    public TechnologyServiceAdmin(TechnologyClient technologyClient) {
        this.technologyClient = technologyClient;
    }

    public void creation(TechnologyDto technologyDto) {
        technologyClient.creation(technologyDto);
    }

    public void deleteById(int id) {
        technologyClient.deleteById(id);
    }
}
