pipeline{
	agent any
	stages {
        	stage('Compile'){
			steps{
        			bat 'cd MavenWebApp'
				bat 'mvn clean compile'
			}
		}
	}
}
