pipeline {
    agent any

    environment {
        IMAGE_NAME = "user-service"
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/satishandsreeja/microservices.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t $IMAGE_NAME:latest .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker run -d -p 8081:8081 $IMAGE_NAME'
            }
        }
    }
}
