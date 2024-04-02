package custom.anotation;

import java.lang.annotation.*;

/**
 * packageName    : custom.anotation
 * fileName       : ProjectMethod
 * author         : rhkdg
 * date           : 2024-04-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-03        rhkdg       최초 생성
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ProjectMethod {

    String value() default "메소드 default 입니다.";

}
