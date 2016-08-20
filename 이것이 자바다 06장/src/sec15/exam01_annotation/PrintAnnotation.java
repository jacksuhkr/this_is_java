package sec15.exam01_annotation;

//@Target({ElementType.METHOD})
//@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
