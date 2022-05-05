package pers.sereins.design.structure.staticProxy;

public class TeacherDao implements ITeacher{
    @Override
    public void teach() {
        System.out.println("老师教书...");
    }
}
