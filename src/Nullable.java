import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD, ElementType.PARAMETER})
public @interface Nullable {
}
