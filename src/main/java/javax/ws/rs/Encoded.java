/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 * 
 * You can obtain a copy of the license at
 * http://www.opensource.org/licenses/cddl1.php
 * See the License for the specific language governing
 * permissions and limitations under the License.
 */

/*
 * Encoded.java
 *
 * Created on June 29, 2007, 11:40 AM
 *
 */

package javax.ws.rs;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Disables automatic decoding of parameter values bound using {@link QueryParam},
 * {@link PathParam}, {@link FormParam} or {@link MatrixParam}.
 * Using this annotation on a method will disable decoding for all parameters.
 * Using this annotation on a class will disable decoding for all parameters of
 * all methods.
 *
 * @see QueryParam
 * @see MatrixParam
 * @see PathParam
 * @see FormParam
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Encoded
{

}
