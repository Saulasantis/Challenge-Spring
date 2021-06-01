package alkemy.challenge.Challenge.Alkemy.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Data
@Entity
@Table(name = "blogs")
@SQLDelete(sql = "UPDATE blogs SET deleted = true WHERE id_blog=?")
@Where(clause = "deleted=false")
public class Blogs implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_blog;

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    private String image;

    @NotEmpty
    private String category;

    private String creation_date;

    @NotNull
    private int creator_user_id;

    private boolean deleted = Boolean.FALSE;

}
