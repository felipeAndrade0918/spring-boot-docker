pipeline {
    agent { label 'docker-java' }
    
    environment { 
        APPNAME = 'java-docker'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo env.BRANCH_NAME
                sh 'ls /root/.m2/'
                sh 'mvn clean deploy'
            }
        }
        stage('Build Docker image') {
        	steps {
        		echo 'Building Docker image...'
        		sh 'docker build -t $APPNAME .'
        	}
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                // sh 'docker rm -f $APPNAME || true'
                // sh 'docker run -d -p 8082:8082 --name $APPNAME $APPNAME'
            }
        }
    }
}