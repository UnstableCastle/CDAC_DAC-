public class StudNode {
    private Student s;
    private StudNode next;

    public StudNode(Student s) {
        this.s = s;
        this.next = null;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public StudNode getNext() {
        return next;
    }

    public void setNext(StudNode next) {
        this.next = next;
    }

  
    public int getRollNo() {
        return s.getRollno();
    }

    @Override
    public String toString() {
        return "StudNode [s=" + s + "]";
    }
}