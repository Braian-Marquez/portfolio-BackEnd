package argentinaprograma.BackEnd.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "skill")
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_skill",nullable = false)
    private Long idSkill;

    @Column(name = "skill_name",nullable = false)
    private String skillName;

    @Column(name = "percent",nullable = false)
    private int percent;

}

