package example2.Task_2.Back.Repository;

import example2.Task_2.Back.Student;

public class RepositoryImpl implements Repository {
    private static RepositoryImpl instance;
    private Student[] developers = new Student[100];
    private int size = 0;

    private RepositoryImpl() {
    }

    public static RepositoryImpl getInstance() {
        if (instance == null) {
            instance = new RepositoryImpl();
        }
        return instance;
    }

    @Override
    public boolean add(Student entity) {
        if (size < developers.length) {
            developers[size++] = entity;
            return true;
        }
        return false;
    }

    @Override
    public Student get(int id) {
        for (int i = 0; i < size; i++) {
            if (developers[i].getStudentId() == id) {
                return developers[i];
            }
        }
        return null;
    }

    @Override
    public boolean update(int id, Student entity) {
        for (int i = 0; i < size; i++) {
            if (developers[i].getStudentId() == id) {
                developers[i] = entity;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < size; i++) {
            if (developers[i].getStudentId() == id) {
                developers[i] = developers[--size];
                developers[size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Student[] getAll() {
        Student[] result = new Student[size];
        for (int i = 0; i < size; i++) {
            result[i] = developers[i];
        }
        return result;
    }
}


