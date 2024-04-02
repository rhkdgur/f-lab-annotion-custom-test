package custom.anotation;

import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : custom.anotation
 * fileName       : Project
 * author         : rhkdg
 * date           : 2024-04-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-03        rhkdg       최초 생성
 */
@Getter
@Setter
public class Project {

    @ProjectName("f-lab annotaion test")
    private String name;

    @ProjectSubject(title = "anotaion 커스텀 제목입니다." , remark = "anotaion 커스텀 테스트를 위한 subject입니다.")
    private String subject;

    @ProjectMethod("테스트 메소드 어노테이션입니다.")
    public void testMethod(){
        System.out.println("테스트 메소드를 출력합니다. ");
    }

}
