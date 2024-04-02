package custom.anotation;

import java.lang.annotation.*;

/**
 * packageName    : custom.anotation
 * fileName       : ProjectSubject
 * author         : rhkdg
 * date           : 2024-04-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-03        rhkdg       최초 생성
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ProjectSubject {

    String title() default "테스트 주제입니다.";

    String remark() default "테스트 비고란입니다.";

}
