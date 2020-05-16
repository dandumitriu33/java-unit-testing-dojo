package com.codecool;

import org.junit.jupiter.api.Test;

import static com.codecool.PhraseReverse.reverse;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Try to find different categories of inputs to test against:
 *
 * invalid input
 * least valid input
 * failing cases
 * cases where exceptions should be thrown
 * cases where exceptions should not be thrown
 */

class PhraseReverseTest {

    @Test
    public void reverseTest() {
        String sentence = "test";
        assertTrue(sentence.equals(reverse("tset")));
    }

    @Test
    public void reverseLeastValid() {
        String sentence = "test .";
        assertTrue(sentence.equals(reverse(". tset")));
    }

    @Test
    public void reverseFail() {
        String sentence = "test";
        assertFalse(sentence.equals(reverse("test")));
    }

    @Test
    public void reverseExceptionThrown() throws NullPointerException {
        assertThrows(NullPointerException.class, ()->{
            reverse(null);
        });
    }

    @Test
    public void reverseExceptionNotThrown() {
        assertDoesNotThrow(() -> reverse(""));
    }


}