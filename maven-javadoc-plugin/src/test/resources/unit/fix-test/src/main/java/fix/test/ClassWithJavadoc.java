package fix.test;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * To add default class tags.
 */
public class ClassWithJavadoc
    implements InterfaceWithJavadoc
{
    /**
     * Constructor comment.
     */
    public ClassWithJavadoc()
    {
    }

    /**
     * The main method
     *
     * @param args      an array of strings that contains the arguments
     */
    public void spacesInJavadocTags( String[] args )
    {
    }

    /**
     * @param str
     */
    public String missingJavadocTags( String str, boolean b, int i )
    {
        return null;
    }

    /**
     * @param str
     * @throws UnsupportedOperationException if any
     */
    public String missingJavadocTags2( String str, boolean b, int i )
        throws UnsupportedOperationException
    {
        return null;
    }

    /**
     * @param str
     */
    public void wrongJavadocTag( String aString )
    {
    }

    /**
     * @param aString
     *      a string
     * @param anotherString
     *      with
     *      multi
     *      line
     *      comments
     * @return a
     *      String
     * @throws UnsupportedOperationException
     *      if any
     */
    public String multiLinesJavadocTags( String aString, String anotherString )
        throws UnsupportedOperationException
    {
        return null;
    }

        /**
         * To take care of the Javadoc indentation.
         *
         * @param aString a
         *      String
         *
         * @return dummy
         *      value
         */
    public String wrongJavadocIndentation( String aString )
    {
        return null;
    }

    // one single comment
    /**
     * To take care of single comments.
     */
    // other single comment
    public String singleComments( String aString )
    {
        return null;
    }

    // ----------------------------------------------------------------------
    // Inheritance
    // ----------------------------------------------------------------------

    /** {@inheritDoc} */
    public void method1( String aString )
    {
    }

    /**
     * {@inheritDoc}
     *
     * specific comment
     */
    public void method2( String aString )
    {
    }

    /**
     * {@inheritDoc}
     *
     * @param aString not
     *      used
     */
    public String method3( String aString )
    {
        return null;
    }

    /**
     * @param aString not
     *      used
     */
    public String method4( String aString )
    {
        return null;
    }

    /**
     * Specific comment
     *
     * @param aString not
     *      used
     */
    public String method5( String aString )
    {
        return null;
    }

    // ----------------------------------------------------------------------
    // Inner classes
    // ----------------------------------------------------------------------

    /**
     * No javadoc for inner class.
     */
    public class InnerClass
    {
        /**
         * constructor
         */
        public InnerClass()
        {
        }

        public void nothing()
        {
        }
    }
}
