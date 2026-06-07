pipeline {
    agent any
    tools {
        maven 'maven_3_9_16'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout([$class: 'GitSCM',
                  branches: [[name: '*/master']],
                  userRemoteConfigs: [[url: 'https://github.com/piyushkmrsadh/demo']]
                ])
                bat 'mvn clean install'
            }
        }
         stage('Duild Docker Image'){
             steps{
                 script{
                     //bat 'docker build -t demo/docker-demo .'
                     bat 'docker build -t piyushkmrsadh/docker-demo:latest .'

                 }
             }
             
         }
         stage('push image to hub'){
             steps{
                 script{
                      withCredentials([string(credentialsId: 'docker-hub', variable: 'dockerhub')]) {
                         bat "docker login -u piyushkmrsadh -p %dockerhub%"
                    }
                    /* withCredentials([string(credentialsId: 'docker-hub', variable: 'dockerhub')]) {
                         // some block
                         sh 'docker login -u piyushkmrsadh -p ${dockerhub}'
                     }*/
                     //sh 'docker push docker-demo'
                     bat 'docker push piyushkmrsadh/docker-demo:latest'
                     
                     
                     
                 }
             }
             
         }
    }
}
