package ru.project.models;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TechnologyDto {
    private int id;
    private String name;
    private String link;
    private String version;
    private String ring;
    private String technologyType;
}
