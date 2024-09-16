public class Resume {
    private String name;
    private int age;
    private int maxPlaces;
    private JobHistory [] jobs;
    private int counter;

    public Resume(String name, int age, int maxPlaces) {
        this.name = name;
        this.age = age;
        this.maxPlaces = maxPlaces;
        this.counter = 0;
        this.jobs = new JobHistory[counter];
        //
    }

    public int returnTotalYearsInJob(String jobType){
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            if(this.jobs[i].getJobType().equals(jobType)){
                sum += this.jobs[i].getYears();
            }
        }
        return sum;
    }
    public static void getNamesOfAcceptedEmployees(Resume [] employees, String jobType, int wantedYearsInTheJob){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].returnTotalYearsInJob(jobType) >= wantedYearsInTheJob)
            {
                System.out.println(employees[i].name);
            }
        }
    }
}
