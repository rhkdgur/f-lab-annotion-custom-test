package org.example;

import custom.anotation.Project;
import custom.anotation.ProjectMethod;
import custom.anotation.ProjectName;
import custom.anotation.ProjectSubject;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * packageName    : org.example
 * fileName       : ${NAME}
 * author         : rhkdg
 * date           : 2024-04-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-03        rhkdg       최초 생성
 */
public class Main {

    public static void main(String[] args) {
        //Project 클래스에 선언된 정보를 들고온다.

        Project project = new Project();
        getProjectField(project.getClass());
        getProjectMethod(project.getClass());

    }


    //클래스의 필드에 선언된 어노테이션 정보 읽어오기
    public static void getProjectField(Class<?> clazz){

        //리플렉션 api를 통하여 어노테이션이 선언된 클래스를 들고온다.
        Field[] fields = clazz.getDeclaredFields();

        for(Field f : fields){
            if(f.isAnnotationPresent(ProjectName.class)){
                ProjectName projectName = f.getAnnotation(ProjectName.class);
                System.out.println("project name : "+projectName.value());
            }else if(f.isAnnotationPresent(ProjectSubject.class)){
                ProjectSubject projectSubject = f.getAnnotation(ProjectSubject.class);
                System.out.println("project title : "+projectSubject.title()+", remark : "+projectSubject.remark());
            }
        }
    }

    //메소드로 선언된 어노테이션 정보를 가져오기
    public static void getProjectMethod(Class<?> c1){
        Method[] methods = c1.getDeclaredMethods();
        for(Method m : methods){
            if(m.isAnnotationPresent(ProjectMethod.class)){
                ProjectMethod projectMethod = m.getAnnotation(ProjectMethod.class);
                System.out.println("project method : "+projectMethod.value());
            }
        }
    }
}