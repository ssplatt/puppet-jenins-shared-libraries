def call() {
  pipeline {
    agent { label 'worker' }
    stages {
      stage('Prepare') {
        steps { 
          rvm 'bundle install'
        }
      }
      stage('Run Tests') {
        failFast true
        parallel {
          stage('Unit Test'){
            steps {
              rvm 'bundle exec rake spec'
            }
          }
          stage('Acceptance Test'){
            steps {
              rvm 'bundle exec rake acceptance'
            }
          }
        }
      }
      stage('Deploy') {
        when {
          branch 'master'
        }
        steps {
          // deploy if master branch and tests pass
          echo "deploy step here"
        }
      }
    }
  }
}
