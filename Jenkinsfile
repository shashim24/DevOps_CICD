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
	}
}
