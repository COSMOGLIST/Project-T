package project.services;
import ru.project.models.TechnologyDto;

import java.util.List;

public interface TechnologyService {
    void creation(TechnologyDto technologyDto);
    TechnologyDto findById(int id);
    void vote(int id, String ring);
    void deleteById(int id);
    List<TechnologyDto> getByCriteria(String id, String name, String technologyType, String ring);
}