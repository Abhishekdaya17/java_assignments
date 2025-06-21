#!/bin/bash

# Clear previous compiled files
rm -f *.class

# Counter and output file
count=1
output_file="All_Java_Outputs.txt"
> "$output_file"

# Loop through sorted .java files
for file in $(ls *.java | sort); do
    classname=$(basename "$file" .java)

    # Skip unwanted files
    if [[ "$classname" == "tempCodeRunnerFile" || "$classname" == "Name" ]]; then
        continue
    fi

    # Compile the .java file silently
    javac "$file" 2>/dev/null

    # If compilation is successful, run and save output
    if [[ $? -eq 0 ]]; then
        echo -e "\n\n--- OUTPUT $count: $classname.java ---" | tee -a "$output_file"
        java "$classname" | tee -a "$output_file"
        ((count++))
    fi
done
