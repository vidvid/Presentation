class Student(
  var id: String,
  var name: String,
  var studyRecords: List[StudyRecord]) extends Actor {
 
  override def act() {
    loop {
      react {
       case GPARequest(term: Term, target: Actor) =>
          ...          
      }
    }
  }
}