pipeline {
    agent any

    tools {
        jdk 'JDK-21'
        maven 'Maven-3'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}
