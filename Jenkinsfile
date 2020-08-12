pipeline {
    agent { label 'docker-java' }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo env.BRANCH_NAME
                
                sh './mvnw clean package'
                stash includes: 'target/*.jar', name: 'targetfiles'
            }
        }
        stage('Build Docker image') {
        	steps {
        		echo 'Building Docker image...'
        		unstash 'targetfiles'
        		sh 'ls'
        	}
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}