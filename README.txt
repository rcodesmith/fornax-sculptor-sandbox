
Maven repository to be published to github based on:
http://chkal.blogspot.com/2010/09/maven-repositories-on-github.html

The repository gets published to
http://rsmith72.github.com/fornax-sculptor-sandbox/repository/

To publish maven artifacts to a working directory:
mvn deploy -DaltDeploymentRepository=pub-scupltor::default::file://<full path to this repository working directory, starting with '/'>

After updating the files in this repository, run:
update-directory-index.sh

then commit locally, and push to github:
> git push origin gh-pages

