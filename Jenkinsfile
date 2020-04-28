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
	}
}
