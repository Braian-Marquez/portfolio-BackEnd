package argentinaprograma.BackEnd.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "experience")
public class Experience implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,name = "id_exp")
    private Long idExp;

    @Column(length = 255,nullable = false,name = "title_exp")
    private String titleExp;

    @Column(name = "start_Exp", columnDefinition = "DATE",nullable = false)
    private LocalDate startDateExp;

    @Column(name = "end_exp", columnDefinition = "DATE",nullable = false)
    private LocalDate endDateExp;


}
