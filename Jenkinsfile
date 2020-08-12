pipeline {
    agent { label 'docker-java' }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo env.BRANCH_NAME
                
                sh './mvnw clean package'
            }
        }
        stage('Build Docker image') {
        	steps {
        		echo 'Building Docker image...'
        		sh 'docker build -t java-docker .'
        	}
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'docker run -d -p 8082:8082 java-docker'
            }
        }
    }
}