package com.base;

public class StringBase
{
	public static void main(String[] args)
	{
		test1();
		test2();
	}
	private static void test1(){
		String a = "aa";
		String b = "bb";
		String c = "xx" + "yy " + a + "zz" + "mm" + b;
		System.out.println("===========test13============");
		System.out.println(c);
	}
	private static void test2(){

		String a = "aa";
		String b = "bb";
		StringBuilder c =new StringBuilder();
		c.append("xx").append("yy ").append( a).append(  "zz").append(  "mm" ).append( b);
		System.out.println("===========test13============");
		System.out.println(c.toString());
	}
	/*
		// class version 49.0 (49)
		// access flags 0x21
		public class com/base/StringBase {

		  // compiled from: StringBase.java

		  // access flags 0x1
		  public <init>()V
		   L0
		    LINENUMBER 3 L0
		    ALOAD 0
		    INVOKESPECIAL java/lang/Object.<init> ()V
		    RETURN
		   L1
		    LOCALVARIABLE this Lcom/base/StringBase; L0 L1 0
		    MAXSTACK = 1
		    MAXLOCALS = 1

		  // access flags 0x9
		  public static main([Ljava/lang/String;)V
		   L0
		    LINENUMBER 7 L0
		    INVOKESTATIC com/base/StringBase.test1 ()V
		   L1
		    LINENUMBER 8 L1
		    RETURN
		   L2
		    LOCALVARIABLE args [Ljava/lang/String; L0 L2 0
		    MAXSTACK = 0
		    MAXLOCALS = 1

		  // access flags 0xA
		  private static test1()V
		   L0
		    LINENUMBER 10 L0
		    LDC "aa"
		    ASTORE 0
		   L1
		    LINENUMBER 11 L1
		    LDC "bb"
		    ASTORE 1
		   L2
		    LINENUMBER 12 L2
		    NEW java/lang/StringBuilder
		    DUP
		    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
		    LDC "xxyy "
		    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
		    ALOAD 0
		    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
		    LDC "zzmm"
		    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
		    ALOAD 1
		    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
		    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
		    ASTORE 2
		   L3
		    LINENUMBER 13 L3
		    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
		    LDC "===========test13============"
		    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
		   L4
		    LINENUMBER 14 L4
		    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
		    ALOAD 2
		    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
		   L5
		    LINENUMBER 15 L5
		    RETURN
		   L6
		    LOCALVARIABLE a Ljava/lang/String; L1 L6 0
		    LOCALVARIABLE b Ljava/lang/String; L2 L6 1
		    LOCALVARIABLE c Ljava/lang/String; L3 L6 2
		    MAXSTACK = 2
		    MAXLOCALS = 3
		}

	 */
}
