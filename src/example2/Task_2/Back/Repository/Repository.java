package example2.Task_2.Back.Repository;

import example2.Task_2.Back.Student;

public interface Repository {
    boolean add(Student entity);

    boolean add(Student entity);

    Student get(int id);
    boolean update(int id, Student entity);
    boolean delete(int id);
    Student[] getAll();
}
