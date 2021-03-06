/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.sencha.shared.client.data;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Field that represents integer data.
 */
public class IntegerFieldDefinition extends FieldDefinition {

    /**
     * Construct a new IntegerFieldDefinition.
     * 
     * @param name
     *            the name of field
     */
    public IntegerFieldDefinition(String name) {
        this(name, null, null);
    }

    /**
     * Construct a new IntegerFieldDefinition
     * 
     * @param name
     *            the name of field
     * @param mapping
     *            the field mapping. Depending on the Reader used, mapping could
     *            be the array index position or an XPath expression when
     *            reading from XML
     */
    public IntegerFieldDefinition(String name, String mapping) {
        this(name, mapping, null);
    }

    /**
     * Construct a new IntegerFieldDefinition
     * 
     * @param name
     *            the name of field
     * @param mapping
     *            the field mapping. Depending on the Reader used, mapping could
     *            be the array index position or an XPath expression when
     *            reading from XML
     */
    public IntegerFieldDefinition(String name, int mapping) {
        this(name, mapping, null);
    }

    /**
     * Construct a new IntegerFieldDefinition
     * 
     * @param name
     *            the field name
     * @param mapping
     *            the field mapping. Depending on the Reader used, mapping could
     *            be the array index position or an XPath expression when
     *            readinf from XML
     * @param converter
     *            format the incoming data before processing it
     */
    public IntegerFieldDefinition(String name, String mapping, Converter converter) {
        jsObj = create(name, mapping, converter);
    }

    /**
     * Construct a new IntegerFieldDefinition
     * 
     * @param name
     *            the field name
     * @param mapping
     *            the field mapping. Depending on the Reader used, mapping could
     *            be the array index position or an XPath expression when
     *            reading from XML
     * @param converter
     *            format the incoming data before processing it
     */
    public IntegerFieldDefinition(String name, int mapping, Converter converter) {
        this(name, String.valueOf(mapping), converter);
    }

    private static JavaScriptObject create(String name, String mapping, Converter converter) {
        JavaScriptObject jsObj = JsoHelper.createObject();
        JsoHelper.setAttribute(jsObj, "name", name);
        JsoHelper.setAttribute(jsObj, "type", "int");
        if (mapping != null)
            JsoHelper.setAttribute(jsObj, "mapping", mapping);
        if (converter != null)
            setConverter(jsObj, converter);
        return jsObj;
    }
}
