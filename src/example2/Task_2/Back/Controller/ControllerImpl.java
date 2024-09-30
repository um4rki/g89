package example2.Task_2.Back.Controller;


import example2.Task_2.Back.Dto.StudentAddDTO;
import example2.Task_2.Back.Dto.StudentDTO;
import example2.Task_2.Back.Repository.Repository;
import example2.Task_2.Back.Repository.RepositoryImpl;
import example2.Task_2.Back.Student;

public class ControllerImpl implements Controller {
    private static final ControllerImpl instance = new ControllerImpl();
    private final Repository repository = RepositoryImpl.getInstance();

    private ControllerImpl() {
    }

    public static ControllerImpl getInstance() {
        return instance;
    }

    @Override
    public StudentDTO add(StudentAddDTO dto) {
        Student developer = new Student(dto.fullName(),
                dto.email(),
                dto.password(),
                dto.salary(),
                dto.status(),
                dto.stack());
        if (repository.add(developer)) {
            return new StudentDTO(developer.getStudentId(),
                    developer.getFullName(),
                    developer.getEmail(),
                    developer.getPassword(),
                    developer.getSalary(),
                    developer.getStatus(),
                    developer.getStack());
        }
        return null;
    }

    @Override
    public StudentDTO get(int id) {
        Student developer = repository.get(id);
        if (developer != null) {
            return new StudentDTO(developer.getStudentId(),
                    developer.getFullName(),
                    developer.getEmail(),
                    developer.getPassword(),
                    developer.getSalary(),
                    developer.getStatus(),
                    developer.getStack());
        }
        return null;
    }

    @Override
    public boolean update(int id, StudentDTO dto) {
        Student developer = repository.get(id);
        if (developer != null) {
            developer.setFullName(dto.fullName());
            developer.setEmail(dto.email());
            developer.setPassword(dto.password());
            developer.setSalary(dto.salary());
            developer.setStatus(dto.status());
            developer.setStack(dto.stack());
            return repository.update(id, developer);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

    @Override
    public StudentDTO[] getAll() {
        Student[] developers = repository.getAll();
        StudentDTO[] studentDTOs = new StudentDTO[developers.length];
        for (int i = 0; i < developers.length; i++) {
            Student dev = developers[i];
            studentDTOs[i] = new StudentDTO(dev.getStudentId(),
                    dev.getFullName(),
                    dev.getEmail(),
                    dev.getPassword(),
                    dev.getSalary(),
                    dev.getStatus(),
                    dev.getStack());
        }
        return studentDTOs;
    }
}
