This repo demonstrates compiler issue with groovy-eclipse-compiler and JDK 11.
It's created to provide executable version for ticket.

## How to get compiler error

Run:

    mvn compile

If you use JDK >=11 it will fail with this error:

    Groovy: compiler error: exception in phase 'canonicalization' in source unit '/private/tmp/j11i/groovy-eclipse-compiler-jdk11-issue/src/main/java/compilerissue/Foo.groovy' No such class: jdk.Profile+Annotation -- JDTClassNode.getTypeClass() cannot locate it using transform loader

Using JDK 8 works without any issues.
