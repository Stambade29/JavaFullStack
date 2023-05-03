public class Course {
    private int id;
    private String name;
    private int duration;
    private double fees;
    
    public Course(int id, String name, int duration, double fees) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.fees = fees;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
}