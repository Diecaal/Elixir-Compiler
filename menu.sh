#!/bin/bash
options=("1. Git Fetch" "2. Execute tests" "3. Generate UMLs" "4. Generate ANTLR" "5. Launch Introspector" "6. Generate MAPL Code")
cg_files=("field_access.xana" "if.xana" "indexing.xana" "simple.xana" "while.xana" "complete/big_input.xana" "complete/input.xana" "offsets/simple.xana")

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
	find . -not -path './examples/codegeneration/*' -name '*.mp' -delete
elif (( $choice == 3 )) ; then
	mvn clean com.github.jeluard:plantuml-maven-plugin:generate
elif (( $choice == 4)) ; then
	mvn clean antlr4:antlr4
elif (( $choice == 5)) ; then
	echo "Enter file to perform introspect (examples dir as root)"
	read filePath
	bin/xana.bat examples/${filePath} --introspector
elif (( $choice == 6)) ; then
	echo "Enter file to perform introspect (examples/codegeneration dir as root)"
	read filePath
	bin/xana.bat examples/codegeneration/${filePath}
	#bin/xana.bat examples/codegeneration/complete/big_input.xana
	#bin/xana.bat examples/codegeneration/${filePath} -a
	#for file in "${cg_files[@]}"
	#do
	  #bin/xana.bat examples/codegeneration/${file}
	#done
else
    echo "Invalid choice!!"
fi
