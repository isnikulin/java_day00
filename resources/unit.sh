#!/bin/bash

echo >output
for f in test*
do
  echo $f >>output
  echo "-----------CONTENTS-----------" >>output
  cat $f >>output
  echo "--------PROGRAM_OUTPUT--------" >>output
  javac *.java && java Program <$f >>output
  echo "-----------------------------" >>output
done
