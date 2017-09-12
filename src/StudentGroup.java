import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students){
		// Add your implementation here
		try {
			if(students==null) {
				throw  "IllegalArgumentException";
			}
			else
				this.students=students;
		}
		catch(Object o) {}
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try {
			if(students==null)
				throw  "IllegalArgumentException";
			else if(index>students.length && index<0)
				throw  "IllegalArgumentException";
			else
				return this.students[index];
		}catch(Object o) {}
	}

	@Override
	public void setStudent(Student student, int index)throws IllegalArgumentException {
		// Add your implementation here
		try {
			if(students==null)
				throw "IllegalArgumentException";
			else if(index>students.length && index<0)
				throw "IllegalArgumentException";
			else
				this.students[index]=student;
		}catch(Object o) {}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int length=students.length, i;
		try {
			if(students==null)
				throw "IllegalArgumentException";
			else {
				this.students = new Student[++length];
			
				for(i=1; i<students.length; i++) {
					this.students[i]=this.students[i-1];
				}
				this.students[0]=student;
				
			}
		}catch(Object o) {}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int length=students.length;
		try {
			if(students==null)
				throw "IllegalArgumentException";
			else {
				this.students = new Student[++length];
				this.students[++length]=student;
				
			}
		}catch(Object o) {}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try {
			if(students==null)
				throw "IllegalArgumentException";
			else if(index>students.length && index<0)
				throw "IllegalArgumentException";
			else
				this.students[++index]=student;
		}catch(Object o) {}
	}

	@Override
	public void remove(int index) throws new "IllegalArgumentException";{
		// Add your implementation here
		int i, length;
		length=students.length;
		try {
			if(students==null)
				throw "IllegalArgumentException";
			else if(index>students.length && index<0)
				throw "IllegalArgumentException";
			else {
				for(i=index; i<length-1; i++) {
					students[i]=students[i+1];
				}
				this.students = new Student[--length];
			}
		}catch(Object o) {}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int i, j, length;
		length=students.length
		try {
			if(students==null)
				throw "IllegalArgumentException";
			else if(index>students.length && index<0)
				throw "IllegalArgumentException";
			else {
				for(i=0; i<=length; i++) {
					if(students[i]==student) {
						for(j=i; i<length-1; i++) {
							students[i]=students[i+1];
						}
						this.students = new Student[--length];
						break;
				    }
			    }
			
		    }
		}catch(Object o) {}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		this.students = new Student[index+1];
		
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int length;
		length=students.length;
		for(i=0; i<length; i++) {
			if(this.students==student) {
				this.students = new Student[i+1];
				break;
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int i, j, length;
		length=students.length
		try {
			if(students==null)
				throw "IllegalArgumentException";
			else if(index>students.length && index<0)
				throw "IllegalArgumentException";
			else {
				for(i=0; i<index; i++) {
					student[i]=student[i+1];
				}
				this.students = new Student[length-index];
				
			}
		}catch(Object o) {}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int length;
		length=students.length;
		for(i=0; i<length; i++) {
			if(this.students==student) {
				break;
			}
			else {
				students[i]=students[i+1];
			}
		}
		this.students = new Student[length-i+1];
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
