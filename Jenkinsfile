pipeline{
  agent any
  stages{
    stage("Clean up"){
      steps{
        deleteDir()
      }
    }stage("clone repo"){
      steps{
        sh "git clone https://github.com/SushantPrakash/JenkinsDocs.git"
      }
    }stage("Build"){
      steps{
        sh "mvn clean install"
      }
    }
  }
}
