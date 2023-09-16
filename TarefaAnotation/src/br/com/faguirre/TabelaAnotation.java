package br.com.faguirre;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TabelaAnotation {

    String nome();
}
