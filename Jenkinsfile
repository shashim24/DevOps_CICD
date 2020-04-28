pipeline{
	agent any
	stages {
        	stage('Compile'){
			steps{
				bat """
					cd MavenWebApp
					mvn clean compile
				"""
			}
		}
		stage('Build'){
			steps{
				bat """
					cd MavenWebApp
					mvn clean install
				"""
			}
		}
		stage('Test'){
			steps{
				bat """
					cd MavenWebApp
					mvn test
				"""
			}
		}
		stage('Deploy'){
			steps{
				bat """
					cd MavenWebApp
					copy /y /v target\MavenWebApp.war C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps
					echo "-----------------------Deployment Done ---------------------------------"
					echo "View App deployed here: http://localhost:8181/MavenWebApp/index.jsp"
					echo "--------------------------------------------------------"
				"""
			}
		}
	}
}
