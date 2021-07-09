public class Person {
    private String name;
    private String jobTitle;
    private int age;

    public Person(String name, String jobTitle, int age){
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", jobTitle=" + jobTitle + ", age=" + age + "]";
	}
}