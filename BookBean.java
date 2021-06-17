/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdbms;
import java.sql.Date;
/**
 *
 * @author HP
 */
public class BookBean {
    private int roll_no;
    private int book_id;
    private String name;
    private Date issuedate;
    private Date returndate;
    public BookBean(int roll_no, int book_id,String name, Date issuedate,Date returndate){
        this.roll_no = roll_no;
        this.book_id = book_id;
        this.name = name;
        this.issuedate = issuedate;
        this.returndate = returndate;
    }

    /**
     * @return the roll_no
     */
    public int getRoll_no() {
        return roll_no;
    }

    /**
     * @param roll_no the roll_no to set
     */
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    /**
     * @return the book_id
     */
    public int getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the issue date
     */
    public Date getIssuedate() {
        return issuedate;
    }

    /**
     * @param issuedate the issue date to set
     */
    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    /**
     * @return the return date
     */
    public Date getReturndate() {
        return returndate;
    }

    /**
     * @param returndate the return date to set
     */
    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }
    
}
