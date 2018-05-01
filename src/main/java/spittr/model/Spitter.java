package spittr.model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by admin on 2018-03-18.
 */
public class Spitter {
    private long id;
//    @NotNull
//    @Size(min = 5,max = 16)
    private String userName;

//    @NotNull
//    @Size(min = 5,max = 25)
    private String passWord;

//    @NotNull
//    @Size(min = 2,max = 30)
    private String firstName;

//    @NotNull
//    @Size(min = 2,max = 32)
    private String lastName;

    public Spitter(){ }

    public Spitter(String userName,String password,String firstName,String lastName){
        this.userName = userName;
        this.passWord = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Spitter(Long id,String userName,String password,String firstName,String lastName){
        this(userName,password,firstName,lastName);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
