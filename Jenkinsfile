pipeline{
	agent any
	stages {
        	stage('Compile'){
			steps{
        			sh 'cd MavenWebApp'
				sh 'mvn clean compile'
			}
		}
	}
}
