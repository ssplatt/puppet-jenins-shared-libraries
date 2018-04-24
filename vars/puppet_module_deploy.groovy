/*
 * Standard prepare env for testing puppet modules
 */

def call () {
  stage ('Deploy') {
    when {
      branch 'master'
    }
    steps {
      // deploy if master branch and tests pass
      echo "deploy step here"
    }
  }
}
