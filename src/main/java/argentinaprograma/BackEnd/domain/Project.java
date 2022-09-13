package argentinaprograma.BackEnd.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "projects")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,name = "id_project")
    private Long idPro;

    @Column(length = 255,nullable = false,name = "title_project")
    private String titleProjects;

    @Column(length = 500,nullable = false,name = "desc_project")
    private String descriptionProjects;

    @Column(length = 255,nullable = false,name = "link_project")
    private String linkProjects;

}