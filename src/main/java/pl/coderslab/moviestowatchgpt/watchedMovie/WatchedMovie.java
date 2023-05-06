package pl.coderslab.moviestowatchgpt.watchedMovie;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "watched_movies")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WatchedMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;
//
//    private Date date;
    private Integer rate;

    @Column(length = 1000)
    private String comment;


}
