#### In this tutorial we will learn life cycle of program

**High Level Language** - humen under standable, but machine did't understand

**Low Level Language** - Machine understandable 0's and 1's. Very hard to understand by humens.

> So we always written instruction in high level language, We have to convert it into machine understable 0's and 1's.

> To convert source code (high level) into machine code, we use either a compiler or an interpreter

## Compiler

> Compiler is a computer program that transform source code of program into another computer language (High level language -> low level language -> machine language).

## Interpreter

> An interpreter is a computer program that execute instuctions written in a programming language. It start to execute source code at first step into efficient object code and execute it.

---

---

| **Compiler**                                                                                                     | **Interpreter**                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------ |
| Scans the entire program and translates it as a whole into machine code                                          | Translate a program one statement at a time                                                                        |
| Usually take a large amount of time to analyze source code But overall execution time is faster than interpreter | Usually takes less amount of time to analyze the source code. But overall execution time is slower than compilers. |
| Generates intermediate object code which futher requires linking. Not memory efficient compared with interpreter | No Intermediate object is generated. So memory efficient                                                           |
| C, C++, Java                                                                                                     | Shell script, Python, JS, Ruby                                                                                     |

---

### C and C++ Program Execution Life Cycle :

Step 1: Write a C Program (.c and .cpp likely used as extension)
Step 2: Pre processor (Expanded source Code)
Step 3: Compiler (Assembly Code)
Step 4: Assembler (Object Code)
Step 5: Linker (Executable Code - Linker combines all the object modules of a source code and lib function -> platform oriented exe file )
Step 6: Loader (Loads Program into Main memory - RAM)

---

### Java Program Execution Life cycle :

Step 1: Write a Java Program (.java extension)
Step 2: Java compiler (javac -> byte code)
Step 3: Java Virutal Machine execute byte code

---

### Python Program Execution life cycle :

> Python is a interpreter. But it has a compilation stage to convert to object(byte) code, that can be executed by python interpreter (python uses code modules).

> Python does not convert its code into machine code. PVM(Python virtual machine) used to execute.

Step 1: Write a python program. (.py etension).
Step 2: Validate against syntax of each line. (if any error program get halt and shows error message)
Step 3: Generate equivalent form in intermediate language (byte code).
Step 4: Byte code executed on PVM.

---

### Javascript Execution life cycle:

> JS in interpreter language
> ECMA international manages JS standards. There is no common/single Javascipt engine. So many javascript engines are available. These are depends on browser vendors. In order to provide consistent result. ECMA script standards are introduced.

    - Netscape browser ->  SpiderMonkey Engine
    - Google chrome -> V8 engine (Node js build on top of this run time)

> So program execution depends on engine implementation.

### Common flow of execution (abstract)

Step 1: Write a Javascript program. (.js etension).
Step 2: Validate against syntax of each line. (if any error program get halt and shows error message)
Step 3: Generate equivalent form in intermediate language (byte code).
Step 4: Byte code executed by Interpreter engine.

---

### Shell scripting

> Lets understand kernal, shell, terminal

    * Kernal is a computer program. It manage all system resource and intermediator other software application and hardwar resources.
    * Shell is special user program. It provides interface to user to use OS services
    * Terminal is a User interface. it accept human readable commands, those instructions are process by shell and pass to OS to do jobs

> Shell script is an interpreter

Step 1: You can execute command directly on Terminal or write list of commands in file.

> you can use programming command or other binary command (system commands, other commands installed in system) directly.

Step 2: Those instructions are processe and executed line by line. if any error happen programs gets stopped there.

---

---

| Static typed Language | Dynamic Typed Language |
| --------------------- | ---------------------- |
| c                     | Javascript             |
| C++                   | Python                 |
| Java                  | Shell Scripting        |

---

# Exec Commands

**To execute a c program run following command:**

Compile:
`gcc <path_to_program_file.c> -o <output_path_file>`

Execute:
`.<output_path_file>`

**To execute a c++ program run following command:**

Compile:
`g++ <path_to_program_file.cpp> -o <output_path_file>`

Execute:
`.<output_path_file>`

**To execute a java program run following command: (if target folder is not there, create it)**

Compile:
`javac <path_to_program_file.java> -d <output_path_file>`

Execute:
`cd <output_path>`
`java <file>`

Python:
`python <path_to_program_file.py>`

Javascript or Nodejs:
`nodejs <path_to_program_file.js>`
