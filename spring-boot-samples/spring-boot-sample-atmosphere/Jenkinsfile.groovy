node('Ulhas') {
   stage 'git'
    
	checkout scm
	//git 'https://github.com/ulhas1991/Jenkins.git'
    stage 'variable'
    def project_path="spring-boot-samples/spring-boot-sample-atmosphere"
  stage 'stage data'
    dir(project_path) {
        stage 'build'
        bat 'mvn compile package '
        stage 'archive'
        archiveArtifacts '/target/*.jar'
    }
    stage 'mail'
    emailext body: 'Success', 
    subject: 'hii', 
    to:'ulhas.us@gmail.com'

}


    


