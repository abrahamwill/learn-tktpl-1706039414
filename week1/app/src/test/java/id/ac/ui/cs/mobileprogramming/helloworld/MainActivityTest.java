package id.ac.ui.cs.mobileprogramming.helloworld;

import android.widget.Button;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainActivityTest {

    private MainActivity mActivity;

    @Test
    public void testMultFunction() {
        mActivity = new MainActivity();
        int valcheck = mActivity.mult(3,5);
        assertEquals(valcheck, 15);
    }
}