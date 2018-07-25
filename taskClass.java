

/**
 * Class taskClass
 */
public class taskClass {

  //
  // Fields
  //

  /**
   * String ID composed of hash of key attributes such as timestamp
   */
  private String taskID;
  /**
   * False indicates incomplete, however may be multiple statuses
   */
  private boolean taskComplete = False;
  /**
   * Status described in string
   */
  private String taskStatus = "unassigned";
  /**
   * Task owner ID - look-up, 0 indicates system owner
   */
  private long int taskOwnerID = 0;
  
  //
  // Constructors
  //
  public taskClass () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of taskID
   * String ID composed of hash of key attributes such as timestamp
   * @param newVar the new value of taskID
   */
  private void setTaskID (String newVar) {
    taskID = newVar;
  }

  /**
   * Get the value of taskID
   * String ID composed of hash of key attributes such as timestamp
   * @return the value of taskID
   */
  private String getTaskID () {
    return taskID;
  }

  /**
   * Set the value of taskComplete
   * False indicates incomplete, however may be multiple statuses
   * @param newVar the new value of taskComplete
   */
  private void setTaskComplete (boolean newVar) {
    taskComplete = newVar;
  }

  /**
   * Get the value of taskComplete
   * False indicates incomplete, however may be multiple statuses
   * @return the value of taskComplete
   */
  private boolean getTaskComplete () {
    return taskComplete;
  }

  /**
   * Set the value of taskStatus
   * Status described in string
   * @param newVar the new value of taskStatus
   */
  private void setTaskStatus (String newVar) {
    taskStatus = newVar;
  }

  /**
   * Get the value of taskStatus
   * Status described in string
   * @return the value of taskStatus
   */
  private String getTaskStatus () {
    return taskStatus;
  }

  /**
   * Set the value of taskOwnerID
   * Task owner ID - look-up, 0 indicates system owner
   * @param newVar the new value of taskOwnerID
   */
  private void setTaskOwnerID (long int newVar) {
    taskOwnerID = newVar;
  }

  /**
   * Get the value of taskOwnerID
   * Task owner ID - look-up, 0 indicates system owner
   * @return the value of taskOwnerID
   */
  private long int getTaskOwnerID () {
    return taskOwnerID;
  }

  //
  // Other methods
  //

}
