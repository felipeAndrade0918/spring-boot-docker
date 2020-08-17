pipeline {
    agent { label 'docker-java' }
    
    environment { 
        APPNAME = 'java-docker'
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
                container('dind') {
                    echo 'Building Docker image...'
                    sh 'docker ps'
                    // sh 'docker build -t $APPNAME .'
                }
        	}
        }
        // stage('Deploy') {
        //     steps {
        //         echo 'Deploying....'
        //         sh 'docker rm -f $APPNAME || true'
        //         sh 'docker run -d -p 8082:8082 --name $APPNAME $APPNAME'
        //     }
        // }
    }
}