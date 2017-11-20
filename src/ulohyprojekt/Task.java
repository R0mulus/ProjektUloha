/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohyprojekt;

import java.util.Date;

/**
 *
 * @author client
 */
public class Task {
    private int id;
    private String name;
    private String desc;
    private Date deadline;
    private Date dateCreated;

    public Task(String name, String desc, Date deadline) {
        this.name = name;
        this.desc = desc;
        this.deadline = deadline;
    }

    public Task(int id, String name, String desc, Date deadline, Date dateCreated) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.deadline = deadline;
        this.dateCreated = dateCreated;
    }

    public Task() {
    }

    public int getId() {
        return id;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    
}
