# jenkins-shared-libraries
Shared libraries for scripted Jenkins pipelines.

## References

 - https://jenkins.io/doc/book/pipeline/
 - https://jenkins.io/doc/book/pipeline/syntax/
 - https://jenkins.io/doc/book/pipeline/shared-libraries/
 - https://jenkins.io/doc/pipeline/steps/

## Examples
 - https://github.com/jenkinsci/pipeline-examples

## Usage
First, in order for your repository to be processed automatically by the Github Organization Scanner in Jenkins, you need to include a Jenkinsfile configuration in your repo. Then, you can use these shared libraries in the Jenkinsfile in order to re-use the code and keep it DRY.

### Example Jenkinsfile
#### Make Your Own Pipeline
Basic declaritive pipeline:
```
pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
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
```

Basic declaritive pipeline with Parallel steps:
```
pipeline {
  agent none
  stages {
    stage('Run Tests') {
      parallel {
        stage('Test On Windows') {
          agent {
            label "windows"
          }
          steps {
            bat "run-tests.bat"
          }
          post {
            always {
              junit "**/TEST-*.xml"
            }
          }
        }
        stage('Test On Linux') {
          agent {
            label "linux"
          }
          steps {
            sh "run-tests.sh"
          }
          post {
            always {
              junit "**/TEST-*.xml"
            }
          }
        }
      }
    }
  }
}
```
#### Scripted Pipelines with Shared Libraries
Basic scripted pipeline to check out code, run tests, and deploy:
```
puppet_module_pipeline()
```

Scripted pipeline to run a subset of puppet module tests:
```
slacksent_start()
puppet_module_test_unit()
puppet_module_test_acceptance()
if (currentBuild.result == 'FAILURE') {
  puppet_module_posttests_failed()
} else {
  puppet_module_posttests_completed()
}
```
