# Java

<!--toc:start-->

- [Java](#java)
  - [Why is Java so famous?](#why-is-java-so-famous)
  - [What is Java?](#what-is-java)
  - [Components of Java](#components-of-java)
    - [What is JVM?](#what-is-jvm)
    - [What is JRE?](#what-is-jre)
    - [What is JDK?](#what-is-jdk)
  - [Installing Java](#installing-java)
    - [Checking version in terminal](#checking-version-in-terminal)
    - [Checking version of the compiler in terminal](#checking-version-of-the-compiler-in-terminal)
    - [Setting environment variables](#setting-environment-variables)
  - [Setting Up an IDE for Java](#setting-up-an-ide-for-java)
    - [Setting up VSCode](#setting-up-vscode)
      - [Extensions](#extensions)
  - [Running Code in JShell](#running-code-in-jshell)
  - [Your first Java Program](#your-first-java-program) - [Compiling and Running](#compiling-and-running)
  <!--toc:end-->

## Why is Java so famous?

Very good for producing enterprise grade software. Whether that's a web app, a
desktop app, or a mobile app.

## What is Java?

Java is an object-oriented programming language. Invented in 1995 by James
Gosling at Sun Microsystems.
Java is a strongly typed language.

## Components of Java

Java has three main components:

- **JRE** - Java Runtime Environment
- **JDK** - Java Development Kit
- **JVM** - Java Virtual Machine

### What is JVM?

Java Virtual Machine (JVM) is a software that runs on the JVM.
JVM is part of the Java Runtime Environment (JRE).

### What is JRE?

Java Runtime Environment (JRE) is the software that runs the JVM.
Contains all of the standard Java libraries.

### What is JDK?

Java Development Kit (JDK) is the software that runs the JRE.
JDK converts Java source code into bytecode.

## Installing Java

Most computers have Java installed by default.
What they don't have is the JDK. This is the Java Development Kit.

To install Java, follow the instructions in the [JDK Download page](https://www.oracle.com/technetwork/java/javase/downloads/index.html).

### Checking version in terminal

```bash
java -version
```

### Checking version of the compiler in terminal

```bash
javac -version
```

### Setting environment variables

```bash
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=$PATH:$JAVA_HOME/bin
```

## Setting Up an IDE for Java

### Setting up VSCode

#### Extensions

- [Java](https://marketplace.visualstudio.com/items?itemName=redhat.java)
- [JDTLS](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

## Running Code in JShell

```bash
> jshell
```

```java
jshell> System.out.print("Hello, World!");
Hello, world!
```

```bash
exit
```

## Your first Java Program

A Java Program is a .java file.
It needs to have a class with a main method.

The main method is the entry point of the program.

It always starts with `public static void main(String[] args)`

We will explore what public static void main means in the next section.

```Java
class Hello {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

### Compiling and Running

```bash
> javac Hello.java
> java Hello
Hello, World!
```

The Javac command is our compiler that is creating the bytecode that is exported in the Hello.class file.
It isn't human readable because it's only designed for machines to read.

The Java command is the JVM that runs the bytecode.

## A word on semi colons

Semi colons are used to separate statements.
We don't put semi colons at the end of a block of code but instead at the end of a statement.

```Java
class Hello {
  public static void main(String[] args) {
    System.out.println("Hello, World!"); // semi colon here
  } // No semi colon here
}
```
