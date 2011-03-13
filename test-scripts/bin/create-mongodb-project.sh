#!/bin/bash

ARTIFACT=test-script-mongodb
ARCHETYPE=fornax-cartridges-sculptor-archetype-mongodb
MODEL=blog.btdesign

# An error exit function
function error_exit 
{
	echo "$1" 1>&2
	exit 1
}
trap error_exit ERR

rm -rf $ARTIFACT

mvn archetype:generate -DinteractiveMode=false -DartifactId=$ARTIFACT -Dversion=1.0-SNAPSHOT -DgroupId=org.fornax.cartridges.sculptor.test -Dpackage=org.fornax.cartridges.sculptor.test -DarchetypeGroupId=org.fornax.cartridges -DarchetypeArtifactId=$ARCHETYPE -DarchetypeVersion=2.0.0 -DarchetypeRepository=http://fornax-platform.org/nexus/content/repositories/public

cp ./test-scripts/$MODEL ./$ARTIFACT/src/main/resources/model.btdesign

cd $ARTIFACT
mvn -Dmaven.test.skip=true install
mvn eclipse:eclipse
cd ..
rm -rf $ARTIFACT