package com.codecool;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.codecool.PhraseReverse.*;
import static org.junit.jupiter.api.Assertions.*;

//import static com.codecool.PhraseReverse.reverse;


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

    @Test
    public void reverseWordsTest() {
        String sentence = "test the rest";
        assertTrue(sentence.equals(PhraseReverse.reverseWords("tset eht tser")));
    }

    @Test
    public void reverseWordsLeastValid() {
        String sentence = "a";
        assertTrue(sentence.equals(reverseWords("a")));
    }

    @Test
    public void reverseWordsFail() {
        String sentence = "test the rest";
        assertFalse(sentence.equals(reverseWords("test the rest")));
    }

    @Test
    public void reverseWordsExceptionThrown() throws NullPointerException {
        assertThrows(NullPointerException.class, ()->{
            reverseWords(null);
        });
    }

    @Test
    public void reverseWordsExceptionNotThrown() {
        assertDoesNotThrow(() -> reverseWords(""));
    }

    @Test
    public void reverseWordOrderTest() {
        String sentence = "test the rest";
        assertTrue(sentence.equals(PhraseReverse.reverseWordOrder("rest the test")));
    }

    @Test
    public void reverseWordOrderLeastValid() {
        String sentence = "a";
        assertTrue(sentence.equals(reverseWordOrder("a")));
    }

    @Test
    public void reverseWordOrderFail() {
        String sentence = "test the rest";
        assertFalse(sentence.equals(reverseWordOrder("test the rest")));
    }

    @Test
    public void reverseWordOrderExceptionThrown() throws NullPointerException {
        assertThrows(NullPointerException.class, ()->{
            reverseWordOrder(null);
        });
    }

    @Test
    public void reverseWordOrderExceptionNotThrown() {
        assertDoesNotThrow(() -> reverseWordOrder(""));
    }

    @Test
    public void reverseNTest() {
        String sentence = "test the rest";
        assertTrue(sentence.equals(PhraseReverse.reverseN("tset the rest", 4)));
    }

    @Test
    public void reverseNLeastValid() {
        String sentence = "a";
        assertTrue(sentence.equals(reverseN("a", 1)));
    }

    @Test
    public void reverseNFail() {
        String sentence = "test the rest";
        assertFalse(sentence.equals(reverseN("test the rest", 4)));
    }

    @Test
    public void reverseNExceptionThrown() throws NullPointerException {
        assertThrows(NullPointerException.class, ()->{
            reverseN(null, 11);
        });
    }

    @Test
    public void reverseNExceptionThrownIndex() throws IndexOutOfBoundsException {
        assertThrows(IndexOutOfBoundsException.class, ()->{
            reverseN("test the", 11);
        });
    }

    @Test
    public void reverseNExceptionNotThrown() {
        assertDoesNotThrow(() -> reverseN("", 0));
    }

    @Test
    public void reverseArrayTest() {
        String [] arr1 = {"A", "B", "C"};
        String [] result = {"C", "B", "A"};
        assertTrue(Arrays.equals(result, reverseArray(arr1)));
    }

    @Test
    public void joinTest() {
        String result = "A B C";
        String [] arr1 = {"A", "B", "C"};
        assertTrue(result.equals(join(arr1, " ")));
    }




}