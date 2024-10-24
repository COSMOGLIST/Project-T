package project.mappers;
import lombok.experimental.UtilityClass;
import project.models.Technology;
import ru.project.models.TechnologyDto;


@UtilityClass
public class Mapper {
    public static TechnologyDto toDto(Technology technology) {
        return TechnologyDto.builder()
                .id(technology.getId())
                .name(technology.getName())
                .technologyType(technology.getTechnologyType().name())
                .link(technology.getLink())
                .version(technology.getVersion())
                .ring(technology.getRing().name())
                .build();
    }
}
