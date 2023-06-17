package pl.agregacja.creation;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String user_name;
    private String user_email;
    private int score;

    public void setId(int id) {
        this.id = id; }
    public int getId() {
        return id;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public String getUser_email() {
        return user_email;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }


}
