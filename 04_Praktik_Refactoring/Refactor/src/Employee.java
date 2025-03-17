public class Employee {
    private PersonalInfo personalInfo;
    private JobInfo jobInfo;

    public Employee(PersonalInfo personalInfo, JobInfo jobInfo) {
        this.personalInfo = personalInfo;
        this.jobInfo = jobInfo;
    }

    public PersonalInfo getPersonalInfo() { return personalInfo; }
    public void setPersonalInfo(PersonalInfo personalInfo) { this.personalInfo = personalInfo; }

    public JobInfo getJobInfo() { return jobInfo; }
    public void setJobInfo(JobInfo jobInfo) { this.jobInfo = jobInfo; }
}
