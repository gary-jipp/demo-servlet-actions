# demo-servlet

- Minimal Java servlet . Can be used as a starting point for a servlet application


- This is a Maven project which means all the output ends up in the "target" directory.  The Eclipse Tomcat plugin is setup in the project to load the webapp from target/WebContent.  That means the servlet will not run until after the first Maven build.  Use "package" as your maven "goals",  or even better "clean, package" to avoid side  to effects of left over files.  Right click, Run as->Maven Build to create the initial run configuration. Then just use it from the Run icon dropdown after that.


- You only need to Run the Maven build once at the beginning or if any non-java files are changed, such as web.xml, or add/removing libraries.  For simple java changes it should be enough to just save the file and tomcat will pick it up


- Right click -> Tomcat -> update context will deploy the project to your tomcat as live code that you can debug. "remove" will undeploy