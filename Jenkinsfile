pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Build') {
            steps {
                dir('MyMavenSeleniumApp01') {
                    deleteDir()   // clean workspace inside folder
                    sh 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                dir('MyMavenSeleniumApp01') {
                    sh 'mvn test'
                }
            }
        }

        stage('Run Application') {
            steps {
                dir('MyMavenSeleniumApp01') {
                    sh 'echo "Checking target folder..."'
                    sh 'ls target'
                    sh 'echo "Running Selenium App..."'
                    sh 'java -jar target/*shaded.jar'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and deployment successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
