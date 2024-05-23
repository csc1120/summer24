# CSC1120 Code
This repository contains code written in Dr. Taylor's lectures
for CSC1120, Data Structures and Graphical Interfaces.

# Announcements

## Week 1

- Lab 1 overview video available **PLEASE WATCH**
- Lab 1 progress:
  - Before Thursday, should be done with ImageIO `read()` and `readMSOE()`
  - By Thursday, should be done with ImageIO `write()` and `writeMSOE()`
  - By Monday, lab completed: ImageIO `readBMSOE()` and `writeBMSOE()`, testing
  - When done, remove dashes so D-O-N-E-1 becomes DONE1
- Don't forget:
  - Reflection due today
  - Homework 1 and Reading Quiz 1 due Saturday
  - Week 2 items available
- FileIO summary:
  - Create a Path
  - Create an InputStream/OutputStream (do this using try-with-resources):
    - For text file input, create a Scanner connected to the InputStream
    - For text file output, create a PrintWriter connected to the OutputStream
    - For binary file input, create a DataInputStream that wraps the InputStream
    - For binary file output, create a DataOutputStream that wraps the OutputStream
  - Read from file using:
    - `next()`, `nextInt()`, `nextLine()`, etc... [Scanner](http://javadoc.taylorial.com/java.base/util/Scanner.html)
    - `readByte()`, `readInt()`, `readDouble()`, etc... [DataInputStream](http://javadoc.taylorial.com/java.base/io/DataInputStream.html)
  - Write to file using:
    - `print()`, `println()`, `format()`, etc... [PrintWriter](http://javadoc.taylorial.com/java.base/io/PrintWriter.html)
    - `writeByte()`, `writeInt()`, `writeDouble()`, etc... [DataOutputStream](http://javadoc.taylorial.com/java.base/io/DataOutputStream.html)
- In-person in DH311 planned in addition to online
