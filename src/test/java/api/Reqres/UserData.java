package api.Reqres;

public class UserData {
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
    //// создаем конструктор, чтоб заполнился класс \\\\
    public UserData(Integer id, String email, String first_name, String last_name, String avatar) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;}

    public UserData() {
        super();
    }
    //// создаем геттеры, с помощью них получаем отдельные переменные \\\\
    public Integer getId() {return id;}
    public String getEmail() {return email;}
    public String getFirst_name() {return first_name;}
    public String getLast_name() {return last_name;}
    public String getAvatar() {return avatar;}
    /** с помощью геттеров будем сравнивать ожидаемый результат с актуальным*/

}




