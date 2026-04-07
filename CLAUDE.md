# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Purpose

This is a structured, interactive Java learning repository for a backend developer learning path. Progress is tracked in [Java_Learning_Path.md](Java_Learning_Path.md). Modules are completed one at a time with concepts, demos, exercises, and mini-projects.

## Java Environment

- **JDK:** JDK 26 at `C:\Program Files\Java\jdk-26`
- **PATH:** May not be set in the shell — prefix commands with `export PATH="/c/Program Files/Java/jdk-26/bin:$PATH"` if `java`/`javac` are not found

## Compiling and Running

No build tool yet (Maven/Gradle introduced in Module 13). Use `javac` and `java` directly:

```bash
# Compile a single file
export PATH="/c/Program Files/Java/jdk-26/bin:$PATH"
cd "d:/Java Learning/ModuleXX_Name"
javac FileName.java

# Run
java ClassName

# Compile all files in a module directory
javac *.java
```

## Repository Structure

Each module folder follows this pattern:
- One concept/exercise per `.java` file
- Final mini-project ties all module concepts together
- Modules build on each other — later modules use patterns from earlier ones

```
Module01_Basics/     — variables, control flow, arrays, methods
Module02_OOP/        — classes, inheritance, polymorphism, abstract/interfaces
Module03_CoreAPIs/   — String/StringBuilder, wrappers, Date/Time API
Module04_Exceptions/ — try-catch, custom exceptions
Module05_Collections/— List, Set, Map, Queue
...
Module13_BuildTools/ — Maven/Gradle introduced here
Module15_SpringCore/ — Spring Framework introduced here
```

## Learning Style

- Interactive: user predicts output before running code, then discusses results
- User writes code themselves; Claude reviews and gives feedback
- Each module ends with a mini-project the user builds independently
- Avoid giving full solutions upfront — use hints and guide toward the answer

## Code Conventions in This Repo

- No build tool for Modules 1–12; plain `javac`/`java` compilation
- Files in a module are compiled together when they reference each other (e.g., `Bank.java` depends on `BankAccount.java` — compile all with `javac *.java`)
- `.class` files are git-ignored; never commit them

## Git Workflow

- Commit after each completed exercise and mini-project
- No `Co-Authored-By` trailers — user is sole author
- Push to `https://github.com/b-nimai/Java-Learning` after each module
