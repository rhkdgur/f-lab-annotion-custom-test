package custom.anotation;

import java.lang.annotation.*;

/**
 * packageName    : custom.anotation
 * fileName       : CustomAnotation1
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
public @interface ProjectName {

    String value() default "";

}
