package Day9_train;

public class Teacher {
    private String name;
    private String profess;

    public Teacher() {
    }

    public Teacher(String name, String profess) {
        this.name = name;
        this.profess = profess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfess() {
        return profess;
    }

    public void setProfess(String profess) {
        this.profess = profess;
    }
}
