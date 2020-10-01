pipeline {
    agent {
        kubernetes {
            yamlFile 'pod.yaml'
        }
    }
    
    environment { 
        APPNAME = 'felipeandrade0918/java-docker'
    }

    stages {
        stage('Build') {
            steps {
                container('jnlp') {
                    echo 'Building..'
                    echo env.BRANCH_NAME
                    sh 'ls'
                    sh './mvnw clean package'
                }
            }
        }
        stage('Build Docker image') {
        	steps {
                container('docker') {
                    echo 'Building Docker image...'
                    sh 'ls'
                    // sh 'docker build -t $APPNAME .'
                    // sh 'docker ps'
                    // sh "docker login -u ${env.USER} -p ${env.PASS}"
                    // sh 'docker push $APPNAME'
                }
        	}
        }
    }
}
