# FastTap
Easy ordering and payment, primarily from mobile devices

Note that use of this will be subject to applicable laws and regulations
for which we will not be held responsible

The first release is "Coltsfoot"

So the taskObject class has a number of properties:

taskID - a unique identifier (hash) taskName - task descriptor (string) taskDetails - task description (string) taskCreator - ID of creator (hash/string) taskOwner - ID of owner (hash/string, array) taskCreatedDate - date of creation (date) taskCreatedTime - time of creation (time) taskDueDate - time task is due to be completed (date) taskDueTime - time task is due to be completed (time) taskStatus - status of task e.g. Active, Dormant, Completed, Dropped etc (string) taskVisibility - who can see the task, individuals and teams (hash/string, array) taskStatusHistory - when task status was changed, from what, to what, and by whom (array) taskPriority - priority of task for rules processing (integer)
