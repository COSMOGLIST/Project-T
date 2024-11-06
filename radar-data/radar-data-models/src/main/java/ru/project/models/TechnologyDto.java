package ru.project.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TechnologyDto {
    private int id;
    @NotNull(message = "Name should not be null")
    @NotEmpty(message = "Name should not be empty")
    private String name;
    @NotNull(message = "Link should not be null")
    @NotEmpty(message = "Link should not be empty")
    private String link;
    @NotNull(message = "Version should not be null")
    @NotEmpty(message = "Version should not be empty")
    private String version;
    @NotNull(message = "Rang should not be null")
    @Pattern(regexp = "^(HOLD|ACCESS|TRIAL|ADOPT)$", message = "Rang should be HOLD, ACCESS, TRIAL or ADOPT")
    private String rang;
    @NotNull(message = "Technology type should not be null")
    @Pattern(regexp = "^(FRAMEWORK|INFRASTRUCTURE|DATA_MANAGEMENT|LANGUAGE)$", message = "Technology type should be FRAMEWORK, INFRASTRUCTURE, DATA_MANAGEMENT or LANGUAGE")
    private String technologyType;
}
