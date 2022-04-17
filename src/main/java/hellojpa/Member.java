package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;
/*테스트테스트테스트트틑트트1414141틑트트틑트트트*/
@Entity
public class Member {

    @Id
    private long id;
    private String name;

    public Member() {

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
