#!/bin/bash
javac -d bin/ --module-path $PATH_TO_FX --add-modules javafx.fxml,javafx.controls src/frontend/*.java
echo "Done compiling......"
cd bin/
java --module-path $PATH_TO_FX --add-modules javafx.fxml,javafx.controls frontend.Main
cd ..
