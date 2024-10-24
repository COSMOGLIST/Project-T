package project.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Technology")
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private TechnologyType technologyType;
    @Column
    private String link;
    @Column
    private String version;
    @Column
    private Ring ring;
    public Technology(String name, TechnologyType technologyType, String link, String version, Ring ring) {
        this.name = name;
        this.link = link;
        this.version = version;
        this.ring = ring;
        this.technologyType = technologyType;
    }
}