String are special kind of variables in all programming language.

### Java:

In Java String is an object and immutable. We can declare string in two ways.

1. direct assignment (String str = "test").

   - In this way strings are stored at JVM GC string pool. In which that, when string initialized it first check with string pool. if none is exist, then it will create or else it reference already existed one. That is also a one of reason of string is immutable.

2. Object assignment (String str = new String("test"))
   - in this way strings are stored at heap memory

On other hand, java support mutable strings (StringBuilder(non-thread safe), StringBuffer(thread safe))
