

/**
 * Class taskDetails
 */
public class taskDetails {

  //
  // Fields
  //

  /**
   * taskID as string
   */
  private String taskID;
  /**
   * Task short title as string
   */
  private String taskTitle = "No task title";
  /**
   * Task description as a string
   */
  private String taskDescription = "No task description";
  /**
   * Incremental task priority
   */
  private int taskPriority = 0;
  /**
   * Char to represent N = doesn't increase in priority with age, L = increases slowly, M = increases normally, H = increases fast, P = increases from current setting to max in one step
   */
  private char taskAgePriority = N;
  
  //
  // Constructors
  //
  public taskDetails () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of taskID
   * taskID as string
   * @param newVar the new value of taskID
   */
  private void setTaskID (String newVar) {
    taskID = newVar;
  }

  /**
   * Get the value of taskID
   * taskID as string
   * @return the value of taskID
   */
  private String getTaskID () {
    return taskID;
  }

  /**
   * Set the value of taskTitle
   * Task short title as string
   * @param newVar the new value of taskTitle
   */
  private void setTaskTitle (String newVar) {
    taskTitle = newVar;
  }

  /**
   * Get the value of taskTitle
   * Task short title as string
   * @return the value of taskTitle
   */
  private String getTaskTitle () {
    return taskTitle;
  }

  /**
   * Set the value of taskDescription
   * Task description as a string
   * @param newVar the new value of taskDescription
   */
  private void setTaskDescription (String newVar) {
    taskDescription = newVar;
  }

  /**
   * Get the value of taskDescription
   * Task description as a string
   * @return the value of taskDescription
   */
  private String getTaskDescription () {
    return taskDescription;
  }

  /**
   * Set the value of taskPriority
   * Incremental task priority
   * @param newVar the new value of taskPriority
   */
  private void setTaskPriority (int newVar) {
    taskPriority = newVar;
  }

  /**
   * Get the value of taskPriority
   * Incremental task priority
   * @return the value of taskPriority
   */
  private int getTaskPriority () {
    return taskPriority;
  }

  /**
   * Set the value of taskAgePriority
   * Char to represent N = doesn't increase in priority with age, L = increases
   * slowly, M = increases normally, H = increases fast, P = increases from current
   * setting to max in one step
   * @param newVar the new value of taskAgePriority
   */
  private void setTaskAgePriority (char newVar) {
    taskAgePriority = newVar;
  }

  /**
   * Get the value of taskAgePriority
   * Char to represent N = doesn't increase in priority with age, L = increases
   * slowly, M = increases normally, H = increases fast, P = increases from current
   * setting to max in one step
   * @return the value of taskAgePriority
   */
  private char getTaskAgePriority () {
    return taskAgePriority;
  }

  //
  // Other methods
  //

}
