import java.time.LocalDateTime;

public class Todo {

  private int id;
  private String name;
  private String description;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;
  private boolean isCompleted;

  public Todo(String name) {
    this.name = name;
    isCompleted = false;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setCompleted(boolean completed) {
    isCompleted = completed;
  }

  public boolean isCompleted() {
    return isCompleted;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  @Override
  public String toString() {
    return name;
  }
}
