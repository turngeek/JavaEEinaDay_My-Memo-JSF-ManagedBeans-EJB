package press.turngeek.mymemo.model;

import java.util.Date;

public class Memo {

    private String description;
    private Date   created;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}
