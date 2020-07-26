package ca.webvue.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vueUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VueUser implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name = "us_seq", sequenceName = "user_seq", initialValue = 0)
    @GeneratedValue(generator = "us_seq", strategy = GenerationType.AUTO)
    private Integer vueUserId;
    private String name;
    private String email;
    private String password;
    

}
