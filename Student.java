package btapmini;

public class Student extends Person{
    private int mathPoint;
    private int physicalPoint;
    private int chemical;

    public Student(){

    }
    public Student(int mathPoint, int physicalPoint, int chemical) {
        this.mathPoint = mathPoint;
        this.physicalPoint = physicalPoint;
        this.chemical = chemical;
    }

    public Student(String name, int age, int mathPoint, int physicalPoint, int chemical) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physicalPoint = physicalPoint;
        this.chemical = chemical;
    }

    public int getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(int mathPoint) {
        this.mathPoint = mathPoint;
    }

    public int getPhysicalPoint() {
        return physicalPoint;
    }

    public void setPhysicalPoint(int physicalPoint) {
        this.physicalPoint = physicalPoint;
    }

    public int getChemical() {
        return chemical;
    }

    public void setChemical(int chemical) {
        this.chemical = chemical;
    }
    public int averagePoint() {
        return (mathPoint + physicalPoint + chemical)/3;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString() +
                "mathPoint=" + mathPoint +
                ", physicalPoint=" + physicalPoint +
                ", chemical=" + chemical +
                '}';
    }
}
