

/**
 * Class taskOwner
 */
public class taskOwner {

  //
  // Fields
  //

  /**
   * taskOwnerID
   */
  private long int taskOwnerID;
  /**
   * User name as string
   */
  private String taskOwnerName = "System User";
  
  //
  // Constructors
  //
  public taskOwner () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of taskOwnerID
   * taskOwnerID
   * @param newVar the new value of taskOwnerID
   */
  private void setTaskOwnerID (long int newVar) {
    taskOwnerID = newVar;
  }

  /**
   * Get the value of taskOwnerID
   * taskOwnerID
   * @return the value of taskOwnerID
   */
  private long int getTaskOwnerID () {
    return taskOwnerID;
  }

  /**
   * Set the value of taskOwnerName
   * User name as string
   * @param newVar the new value of taskOwnerName
   */
  private void setTaskOwnerName (String newVar) {
    taskOwnerName = newVar;
  }

  /**
   * Get the value of taskOwnerName
   * User name as string
   * @return the value of taskOwnerName
   */
  private String getTaskOwnerName () {
    return taskOwnerName;
  }

  //
  // Other methods
  //

}
