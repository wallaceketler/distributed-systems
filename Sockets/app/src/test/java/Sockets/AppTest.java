/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Sockets;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
       Servidorp classUnderTest = newServidorp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
