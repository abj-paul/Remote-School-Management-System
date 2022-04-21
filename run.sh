#!/bin/bash
javac -d bin/ src/backend/institution/*.java src/backend/student/*.java src/backend/teacher/*.java src/backend/generalClasses/*.java src/backend/result/*.java src/backend/exceptions/*.java src/backend/parser/*.java src/networking/Server.java
echo "Done compiling!"
cd bin/
java backend.parser.Parser
java networking.Client
echo "Exiting...!"
cd ..
