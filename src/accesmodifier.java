
class Student {
    private int rollNumber;  // private: accessible only within the class

    public void setRollNumber(int newRollNumber) {
        rollNumber = newRollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

class AccessModifier {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNumber(101);
        System.out.println(s.getRollNumber());
    }
}
