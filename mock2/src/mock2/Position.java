package mock2;

public class Position {
	private String title;
	private String description;
	private Employee emp;
	public Position(String title, String description, Employee emp) {
		super();
		this.title = title;
		this.description = description;
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Position [title=" + title + ", description=" + description + ", emp=" + emp + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
