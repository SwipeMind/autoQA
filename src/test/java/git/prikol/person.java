package git.prikol;

public class person extends class_andrew {

    private string fistname;
    private string lasname;

    public string getFistname() {
        return fistname;
    }

    public void setFistname(string fistname) {
        this.fistname = fistname;
    }

    public string getLasname() {
        return lasname;
    }

    public void setLasname(string lasname) {
        this.lasname = lasname;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + super.getId() + '\'' +
                "fistname=" + fistname + '\'' +
                ", lasname=" + lasname + '\'' +
                '}';
    }
}
