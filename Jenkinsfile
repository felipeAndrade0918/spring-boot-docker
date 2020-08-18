pipeline {
    agent { label 'docker-java' }
    
    environment { 
        APPNAME = 'felipeandrade0918/java-docker'
    }

    stages {
        stage('Build') {
            steps {
                container('jnlp') {
                    echo 'Building..'
                    echo env.BRANCH_NAME
                    
                    sh './mvnw clean package'
                }
            }
        }
        stage('Build Docker image') {
        	steps {
                container('docker') {
                    echo 'Building Docker image...'
                    sh 'docker build -t $APPNAME .'
                }
        	}
        }
    }
}