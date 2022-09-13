package argentinaprograma.BackEnd.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "education")
public class Education implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_edu")
    private Long idEdu;

    @Column(length = 255, nullable = false, name = "title_edu")
    private String titleEdu;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "start_edu", columnDefinition = "DATE", nullable = false)
    private LocalDate startDateEdu;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "end_edu",  columnDefinition = "DATE", nullable = false)
    private LocalDate endDateEdu;

}