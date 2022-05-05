package pers.sereins.design.structure.staticProxy;

public class TeacherDaoProxy implements ITeacher {

    private TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理。。。。");
        teacherDao.teach();
    }
}
