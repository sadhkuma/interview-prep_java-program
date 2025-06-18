package comparable;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    

	// Natural ordering by id
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

