/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.nathan3882.idealtrains;

import com.thalesgroup.rtti._2017_10_01.ldbsv.GetBoardByCRSParams;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBElement;

/**
 *
 * @author natha
 */
public class Action {

    private final String actionString;
    private final Object objectFactory;

    public Object getObjectFactory() {
        return objectFactory;
    }
    private final String response;

    public Action(Object objectFactory, String getString) {
        this.actionString = getString;
        this.objectFactory = objectFactory;
        this.response = getString + "Response";
    }

    public String getActionString() {
        return actionString;
    }

    public String getResponse() {
        return response;
    }

    public JAXBElement<?> doParams(Object genericType) {
        String functionNameInFacClass = "create" + getActionString() + "Request";
        Method func = null;
        Class gTypeClass = genericType.getClass();
        Object invokedResponse = null;
        try {
            func = getObjectFactory().getClass().getMethod(functionNameInFacClass, gTypeClass);
            invokedResponse = func.invoke(getObjectFactory(), genericType); //Invoke createACTIONRequest in suitable object factory
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        JAXBElement<?> element = (JAXBElement<?>) invokedResponse;
        return element;
    }
}
