package example2.Task_2.Back.Dto;

import example2.Task_2.Back.Enums.EducationStage;
import example2.Task_2.Back.Enums.StackEnum;

public record StudentDTO(int developerId, String fullName, String email, String password, double salary,
                         EducationStage status, StackEnum stack) {
}
