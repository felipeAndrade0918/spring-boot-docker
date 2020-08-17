pipeline {
    agent { label 'docker-java' }
    
    environment { 
        APPNAME = 'java-docker'
    }

    stages {
        stage('Build') {
            steps {
                // container('jnlp') {
                //     echo 'Building..'
                //     echo env.BRANCH_NAME
                    
                //     sh './mvnw clean package'
                // }
                container('docker') {
                    sh "docker login -u ${env.USER} -p ${env.PASS}"
                }
            }
        }
        // stage('Build Docker image') {
        // 	steps {
        //         container('docker') {
        //             echo 'Building Docker image...'
        //             // sh 'docker build -t $APPNAME .'
        //             sh 'docker images'
        //             sh 'ls'
        //         }
        // 	}
        // }
        // stage('Deploy') {
        //     steps {
        //         echo 'Deploying....'
        //         sh 'docker rm -f $APPNAME || true'
        //         sh 'docker run -d -p 8082:8082 --name $APPNAME $APPNAME'
        //     }
        // }
    }
}