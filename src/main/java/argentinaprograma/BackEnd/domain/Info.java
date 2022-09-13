package argentinaprograma.BackEnd.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "info_user")
@Getter
@Setter
@Entity
public class Info implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, name = "id_info")
    private Long idInfo;

    @Column(name = "name_info", length = 100, nullable = false)
    private String nameInfo;

    @Column(name = "surname_info", length = 100, nullable = false)
    private String surnameInfo;

    @Column(name = "title_info", length = 100, nullable = false)
    private String titleInfo;

    @Column(name = "desc_info", length = 1000, nullable = false)
    private String descriptionInfo;



    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Education> educationList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experience> experienceLisT;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Project> projectList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillsList;

}
