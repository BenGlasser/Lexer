This directory contains a significantly trimmed version of the
sources for the Mini compiler that only keeps the code needed
for lexical analysis.

You should be able to generate the file mini/MiniLexer.java by
running the following command (in the same directory as this
README file):

  jflex mini/Mini.jflex

(The actual command that you use will depend on how you have
installed jflex.)

Then you should be able to compile the lexer, together with the
other Java code that I've supplied using:

  javac compiler/*.java mini/*.java ListTokenCodes.java

And, finally, you should be able to run and test this simple
program using commands like the following:

  java ListTokenCodes squares

If you run in to problems not mentioned here, let me know and
I'll do my best to help out!


This file was modified by IntelliJ IDEA 11.1.3 for binding GitHub repository