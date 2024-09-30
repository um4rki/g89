package example2.Task_2.Back.Controller;


import example2.Task_2.Back.Dto.StudentAddDTO;
import example2.Task_2.Back.Dto.StudentDTO;

public interface Controller {
    StudentDTO add(StudentAddDTO dto);
    StudentDTO get(int id);
    boolean update(int id, StudentDTO dto);
    boolean delete(int id);
    StudentDTO[] getAll();
}

