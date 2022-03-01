#!/bin/bash
options=("1. Git Fetch" "2. Execute tests" "3. Generate UMLs" "4. Generate ANTLR" "5. Launch Introspector")
for i in "${options[@]}"
do
    echo $i
done

echo "Enter option to execute: "
read choice

if (( $choice == 1 )) ; then
	git remote add upstream https://github.com/dlp-luis/dlp-compiler.git
	git fetch upstream
	git merge upstream/main
elif (( $choice == 2 )) ; then
	mvn clean antlr4:antlr4 test
elif (( $choice == 3 )) ; then
	mvn clean com.github.jeluard:plantuml-maven-plugin:generate
elif (( $choice == 4)) ; then
	mvn clean antlr4:antlr4
elif (( $choice == 5)) ; then
	mvn clean antlr4:antlr4 test-compile exec:java -Dexec.classpathScope=test -Dexec.mainClass="es.uniovi.dlp.parser.RunIntrospector" -Dexec.args="examples/basic.xana"
else
    echo "Invalid choice!!"
fi
