public class StudentSupport {
    private StudLes [] arr ;
    private int [] count;
    private int counter;

    public StudentSupport(StudLes[] arr, int[] count) {
        this.arr = new StudLes[12];
        this.count = new int[5];
    }
    public int numberOfStudents()
    {
        return this.counter;
    }
    public void addLesson(StudLes study){
        if(counter != 12) {
            this.arr[counter] = study;
            counter++;
            this.count[study.getDay() - 1]++;
        }
        else
            System.out.println("there isn't any room to study");
    }
    public void cancelDay(int day){
        for (int i = 0; i < this.counter; i++) {
            if (this.arr[i].getDay() == day){
                System.out.println(this.arr[i].getName());
            }
        }
    }
}
