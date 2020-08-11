pipeline {
    agent { label 'docker-java' }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo env.BRANCH_NAME
                
                if (true) {
                	echo 'Flow control works!'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}