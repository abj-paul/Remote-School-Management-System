#!/bin/bash
javac -d bin/ src/backend/institution/*.java src/backend/student/*.java src/backend/teacher/*.java src/backend/generalClasses/*.java src/backend/result/*.java src/backend/exceptions/*.java src/backend/parser/*.java src/networking/Server.java src/Main/Main.java
echo "Done compiling!"
cp src/networking/input.txt bin/networking/input.txt
cd bin/
java main.Main
#java networking.Client
echo "Exiting...!"
cd ..
