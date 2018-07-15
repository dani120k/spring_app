package sample;

public class User {

    private int id;
    private String login;
    private String mail;
    private String password;

    public User(int id, String login, String mail, String password){
        this.id = id;
        this.mail = mail;
        this.password = password;
    }

    public User(String id, String login, String password){
        this.id = Integer.parseInt(id);
        this.mail = login;
        this.password = password;
    }

    @Override
    public String toString(){
        return String.format("Id: %d, Login: %s, Mail: %s,Password: %s", id, login, mail, password);
    }

    public int getid(){
        return id;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public String getMail(){
        return mail;
    }
}
