package com.sandbox.drone.test;

import com.sandbox.runtime.services.LiquidRenderer;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by nickhoughton on 4/08/2014.
 */
public class LiquidRendererTest {
    @Test
    public void testSimple() throws Exception {

        Map<String, Object> vars = new HashMap<String, Object>();
        vars.put("name","ando");
        String result = new LiquidRenderer().render("hi {{name}}", vars);
        assertEquals("hi ando",result);
    }

    @Test
    public void testPropertiesWithDots() throws Exception {

        Map<String, Object> vars = new HashMap<String, Object>();
        Map<String, Object> form = new HashMap<String, Object>();
        List list = Arrays.asList(form);
        form.put("a.b","ando");
        vars.put("list", list);

        String result = new LiquidRenderer().render("hi {{list[0][\"a.b\"]}}", vars);
        assertEquals("hi ando",result);
    }
}
