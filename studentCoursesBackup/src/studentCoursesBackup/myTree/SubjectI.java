package studentCoursesBackup.myTree;

public interface SubjectI {

	public void removeObserver(Node observerRemove);
	public void addObserver(Node observerAdd);
	public void notify(String courses, OperationEnum enumValue);
	
}
