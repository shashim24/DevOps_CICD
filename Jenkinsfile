pipeline{
	agent any
	stages {
        	stage('Build'){
			steps{
        			sh 'cd MavenWebApp'
				sh 'mvn -Dmaven.test.failure.ignore=true install'
			}
		}
	}
}
