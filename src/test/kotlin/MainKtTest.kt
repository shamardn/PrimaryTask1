import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_Return_a_Repetition_When_TheListIsOf_a_Only(){
        // given
        val list = listOf<String>("a","a","a")
        // when
        val avg = aRepetition(list)
        // then
        assertEquals(100.0,avg)
    }

    @Test
    fun should_Return_0_Repetition_When_TheListIsOf_b_Only(){
        // given
        val list = listOf<String>("b","b","b")
        // when
        val avg = aRepetition(list)
        // then
        assertEquals(0.0,avg)
    }

    @Test
    fun should_Return_a_Repetition_When_TheListIsOf_a_And_b(){
        // given
        val list = listOf<String>("b","a","b")
        // when
        val avg = aRepetition(list)
        // then
        assertEquals(33.3,avg)
    }

    @Test
    fun should_Return_Minus1_When_TheListIsOf_Contains_Other_Char(){
        // given
        val list = listOf<String>("a","a","c")
        // when
        val avg = aRepetition(list)
        // then
        assertEquals(-1.0,avg)
    }

}