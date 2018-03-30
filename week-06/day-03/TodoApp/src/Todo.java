import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Todo {

  private int id;
  private String name;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;
  private boolean isCompleted;

  public Todo(String name) {
    this.name = name;
    isCompleted = false;
  }

  public long completionTime() {
    return ChronoUnit.DAYS.between(createdAt, completedAt);
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

  public LocalDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(LocalDateTime completedAt) {
    this.completedAt = completedAt;
  }

  @Override
  public String toString() {
    return name;
  }
}
