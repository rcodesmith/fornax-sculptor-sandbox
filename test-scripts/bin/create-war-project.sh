#!/bin/bash

ARTIFACT=test-script-war
MODEL=library.btdesign
GUI_MODEL=library.guidesign

# An error exit function
function error_exit 
{
	echo "$1" 1>&2
	exit 1
}
trap error_exit ERR

rm -rf $ARTIFACT
rm -rf $ARTIFACT-web
rm -rf $ARTIFACT-parent

mvn archetype:generate -DinteractiveMode=false -DartifactId=$ARTIFACT-parent -Dversion=1.0-SNAPSHOT -DgroupId=org.fornax.cartridges.sculptor.test -Dpackage=org.fornax.cartridges.sculptor.test -DarchetypeGroupId=org.fornax.cartridges -DarchetypeArtifactId=fornax-cartridges-sculptor-archetype-parent -DarchetypeVersion=2.0.0 -DarchetypeRepository=http://fornax-platform.org/nexus/content/repositories/public
mvn archetype:generate -DinteractiveMode=false -DartifactId=$ARTIFACT -Dversion=1.0-SNAPSHOT -DgroupId=org.fornax.cartridges.sculptor.test -Dpackage=org.fornax.cartridges.sculptor.test -DarchetypeGroupId=org.fornax.cartridges -DarchetypeArtifactId=fornax-cartridges-sculptor-archetype -DarchetypeVersion=2.0.0 -DarchetypeRepository=http://fornax-platform.org/nexus/content/repositories/public
mvn archetype:generate -DinteractiveMode=false -DartifactId=$ARTIFACT-web -Dversion=1.0-SNAPSHOT -DgroupId=org.fornax.cartridges.sculptor.test -Dpackage=org.fornax.cartridges.sculptor.test -DarchetypeGroupId=org.fornax.cartridges -DarchetypeArtifactId=fornax-cartridges-sculptor-archetype-jsf -DarchetypeVersion=2.0.0 -DarchetypeRepository=http://fornax-platform.org/nexus/content/repositories/public

cp ./test-scripts/$MODEL ./$ARTIFACT/src/main/resources/model.btdesign
cp ./test-scripts/$GUI_MODEL ./$ARTIFACT-web/src/main/resources/model.guidesign

cd $ARTIFACT-parent
mvn -Dmaven.test.skip=true install
mvn eclipse:eclipse
cd ..
rm -rf $ARTIFACT
rm -rf $ARTIFACT-web
rm -rf $ARTIFACT-parent

