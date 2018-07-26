package test;

import org.junit.Assert;
import org.junit.Test;
import solutions.*;

public class ProblemsTest {

    @Test public void problem001_Test() { Assert.assertEquals(233168, new Problem001().run()); }

    @Test public void problem002_Test() { Assert.assertEquals(4613732, new Problem002().run()); }

    @Test public void problem003_Test() { Assert.assertEquals(6857, new Problem003().run()); }

    @Test public void problem004_Test() { Assert.assertEquals(906609, new Problem004().run()); }

    @Test public void problem007_Test() { Assert.assertEquals(104743, new Problem007().run()); }
}
